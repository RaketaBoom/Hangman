package backend.academy.hangman;

import backend.academy.hangman.categories.Category;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Game {
    private static final int MAX_ATTEMPTS = 8; // Параметр, который можно изменять. Это количество попыток в игре
    private static final int ATTEMPTS_WITHOUT_HINT = 7; // Тоже можно менять. Число попыток без подсказки.
    private static final int HANGMAN_PARTS = 9;
    private static final float STEP = (HANGMAN_PARTS - 1) * 1.0F / MAX_ATTEMPTS;
    private float sumSteps;
    private TypeCategory typeCategory;
    private Category category;
    private Level level;
    private InputHandler input;
    private ConsoleDisplay display;
    private Word word;
    private int currAttempt;

    private Set<Character> usedLetters;

    public Game(InputStream inputStream, PrintStream outputStream) {
        this.input = new InputHandler(new Scanner(inputStream));
        this.display = new ConsoleDisplay(outputStream);
    }

    public void start() {
        usedLetters = new HashSet<>();
        display.gameRules(MAX_ATTEMPTS, ATTEMPTS_WITHOUT_HINT);
        boolean letLoop = true;
        while (letLoop) {
            try {
                display.choiceCategory();
                typeCategory = input.getTypeCategory();
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

        category = Category.initializeCategory(typeCategory, level);

        word = category.getRandomWord();
        currAttempt = 1;
        sumSteps = 1F;
        display.showCategory(typeCategory);
        display.showLevel(level);

        display.startGame();

        while (!isGameOver()) {
            display.hangmanState(HangmanState.getState(currAttempt));
            display.usedLetters(usedLetters);
            display.maskedWord(word.maskedWord());
            if (currAttempt > ATTEMPTS_WITHOUT_HINT) {
                display.showHint(word.hint());
            }
            letLoop = true;
            char letter = 'r';
            while (letLoop) {
                try {
                    display.enterLetter();
                    letter = input.getLetter();
                    if (usedLetters.contains(letter)) {
                        display.usedLetter();
                        continue;
                    }
                    letLoop = false;
                } catch (RuntimeException e) {
                    display.errorMessage(e.getMessage());
                }
            }
            usedLetters.add(letter);
            if (word.tryGuess(letter)) {
                display.letterGuessed(letter);
            } else {
                sumSteps += STEP;
                currAttempt = Math.round(sumSteps);
            }

        }

        display.hangmanState(HangmanState.getState(currAttempt));

        if (word.isWin()) {
            display.win(word.modelWord());
        } else {
            display.lose(word.modelWord());
        }
    }

    private boolean isGameOver() {
        return word.isWin() || currAttempt == HANGMAN_PARTS;
    }
}
