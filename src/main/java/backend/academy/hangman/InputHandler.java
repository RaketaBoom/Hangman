package backend.academy.hangman;

import backend.academy.hangman.exceptions.NonCategoryNumberException;
import backend.academy.hangman.exceptions.NonLevelNumberException;
import backend.academy.hangman.exceptions.NonRussianLetterException;
import backend.academy.hangman.validators.InputValidator;
import java.util.Scanner;

public class InputHandler {
    private Scanner scanner;

    public InputHandler(Scanner scanner) {
        this.scanner = scanner;
    }

    public Level getLevel() {
        String input = scanner.nextLine();
        if (!InputValidator.isNumberLevel(input) && !input.isEmpty()) {
            throw new NonLevelNumberException();
        }
        Level level;
        if (input.isEmpty()) {
            level = Level.random();
        } else {
            int value = Character.getNumericValue(input.charAt(0));
            level = Level.valueOf(value);
        }
        return level;
    }

    public TypeCategory getTypeCategory() {
        String input = scanner.nextLine();
        if (!InputValidator.isNumberCategory(input) && !input.isEmpty()) {
            throw new NonCategoryNumberException();
        }
        TypeCategory type;
        if (input.isEmpty()) {
            type = TypeCategory.random();
        } else {
            int value = Character.getNumericValue(input.charAt(0));
            type = TypeCategory.valueOf(value);
        }
        return type;
    }

    public char getLetter() {
        String input = scanner.nextLine().toLowerCase();
        if (!InputValidator.isRussianLetter(input)) {
            throw new NonRussianLetterException();
        }
        return input.charAt(0);
    }
}
