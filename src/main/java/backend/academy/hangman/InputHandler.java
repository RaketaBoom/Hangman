package backend.academy.hangman;

import backend.academy.hangman.exceptions.NonCategoryNumberException;
import backend.academy.hangman.exceptions.NonLevelNumberException;
import backend.academy.hangman.exceptions.NonRussianLetterException;
import backend.academy.hangman.validators.InputValidator;
import java.util.Scanner;

public class InputHandler {
    private final Scanner scanner;

    public InputHandler(Scanner scanner) {
        this.scanner = scanner;
    }

    public Level getLevel() {
        String input = scanner.nextLine();
        if (!InputValidator.isNumberLevel(input) && !input.isEmpty()) {
            throw new NonLevelNumberException();
        }

        if (input.isEmpty()) {
            return Level.random();
        }
        int value = Character.getNumericValue(input.charAt(0));

        return Level.valueOf(value);
    }

    public TypeCategory getTypeCategory() {
        String input = scanner.nextLine();
        if (!InputValidator.isNumberCategory(input) && !input.isEmpty()) {
            throw new NonCategoryNumberException();
        }

        if (input.isEmpty()) {
            return TypeCategory.random();
        }
        int value = Character.getNumericValue(input.charAt(0));

        return TypeCategory.valueOf(value);
    }

    public char getLetter() {
        String input = scanner.nextLine().toLowerCase();
        if (!InputValidator.isRussianLetter(input)) {
            throw new NonRussianLetterException();
        }
        return input.charAt(0);
    }
}
