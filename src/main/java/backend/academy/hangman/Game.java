package backend.academy.hangman;

import backend.academy.hangman.categories.Category;
import backend.academy.hangman.exceptions.IllegalAttemptsException;
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
    private int currAttempt;

    private InputHandler input;
    private ConsoleDisplay display;

    private TypeCategory typeCategory;
    private Category category;
    private Level level;
    private Word word;

    private Set<Character> usedLetters;

    public Game(InputStream inputStream, PrintStream outputStream) {
        this.input = new InputHandler(new Scanner(inputStream));
        this.display = new ConsoleDisplay(outputStream);
    }

    public void start() {
        try {
            checkMaxAttempts();
        } catch (RuntimeException e) {
            display.errorMessage(e.getMessage());
            return;
        }

        display.gameRules(MAX_ATTEMPTS, ATTEMPTS_WITHOUT_HINT);

        typeCategory = requestTypeCategory();

        level = requestLevel();

        category = Category.initializeCategory(typeCategory, level);
        word = category.getRandomWord();
        currAttempt = 1;
        sumSteps = 1F;
        usedLetters = new HashSet<>();

        display.category(typeCategory);
        display.level(level);
        display.startGame();

        while (!isGameOver()) {
            display.hangmanState(HangmanState.getState(currAttempt));
            display.usedLetters(usedLetters);
            display.maskedWord(word.maskedWord());
            if (currAttempt > ATTEMPTS_WITHOUT_HINT) {
                display.hint(word.hint());
            }

            char letter = requestLetter();

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

    private char requestLetter() {
        while (true) {
            try {
                display.enterLetter();
                char letter = input.getLetter();
                if (usedLetters.contains(letter)) {
                    display.usedLetter();
                    continue;
                }
                return letter;
            } catch (RuntimeException e) {
                display.errorMessage(e.getMessage());
            }
        }
    }

    private Level requestLevel() {
        while (true) {
            try {
                display.choiceLevel();
                level = input.getLevel();
                return level;
            } catch (RuntimeException e) {
                display.errorMessage(e.getMessage());
            }
        }
    }

    private TypeCategory requestTypeCategory() {
        while (true) {
            try {
                display.choiceCategory();
                typeCategory = input.getTypeCategory();
                return typeCategory;
            } catch (RuntimeException e) {
                display.errorMessage(e.getMessage());
            }
        }
    }

    private boolean isGameOver() {
        return word.isWin() || currAttempt == HANGMAN_PARTS;
    }

    private void checkMaxAttempts() {
        if (MAX_ATTEMPTS <= 0) {
            throw new IllegalAttemptsException();
        }
    }
}
