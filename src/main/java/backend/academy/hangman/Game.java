package backend.academy.hangman;

import backend.academy.hangman.categories.Category;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Set;

public class Game {

    private static final int HANGMAN_PARTS = 9;
    private static final int MAX_ATTEMPTS = 7;
    private Category category;
    private Level level;
    private InputHandler input;
    private ConsoleDisplay display;
    private Word word;
    private int currAttempt;
    private Set<Character> usedLetters;

    public Game(InputStream inputStream, PrintStream outputStream) {
        this.input = new InputHandler(inputStream);
        this.display = new ConsoleDisplay(outputStream);
    }

    public void start() {
        usedLetters = new HashSet<>();
        display.gameRules(MAX_ATTEMPTS);
        boolean letLoop = true;
        while (letLoop) {
            try {
                display.choiceCategory();
                category = input.getCategory();
                letLoop = false;
            } catch (RuntimeException e) {
                display.errorMessage(e.getMessage());
            }
        }
        letLoop = true;
        while (letLoop) {
            try {
                display.choiceLevel();
                level = input.getLevel();
                letLoop = false;
            } catch (RuntimeException e) {
                display.errorMessage(e.getMessage());
            }
        }

        word = new Word(category.getRussianRandomWord(level));
        currAttempt = 1;
        display.startGame();

        while(!isGameOver()){
            display.hangmanState(HangmanState.getState(currAttempt));
            display.usedLetters(usedLetters);
            display.maskedWord(word.maskedWord());
            letLoop = true;
            char letter = 'r'; // хз как обойти этот костыль, чтобы не инициализиоровать сразу
            while(letLoop) {
                try{
                    display.enterLetter();
                    letter = input.getLetter();
                    if(usedLetters.contains(letter)){
                        display.usedLetter();
                        continue;
                    }
                    letLoop = false;
                }catch (RuntimeException e){
                    display.errorMessage(e.getMessage());
                }
            }
            usedLetters.add(letter);
            if(word.tryGuess(letter)){
                display.letterGuessed(letter);
            }
            else{
                currAttempt += HANGMAN_PARTS / MAX_ATTEMPTS;
            }

        }

        display.hangmanState(HangmanState.getState(currAttempt));

        if(word.isWin()){
            display.win();
        }
        else{
            display.lose();
        }
    }

    private boolean isGameOver(){
        return word.isWin() || currAttempt == MAX_ATTEMPTS;
    }
}
