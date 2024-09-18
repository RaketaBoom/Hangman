package backend.academy.hangman;

import backend.academy.hangman.categories.Category;
import backend.academy.hangman.categories.impl.Animal;
import backend.academy.hangman.categories.impl.Color;
import backend.academy.hangman.categories.impl.Country;
import backend.academy.hangman.categories.impl.Fruit;
import backend.academy.hangman.categories.impl.Sport;
import backend.academy.hangman.exceptions.NonCategoryNumberException;
import backend.academy.hangman.exceptions.NonLevelNumberException;
import backend.academy.hangman.exceptions.NonRussianLetterException;
import backend.academy.hangman.validators.InputValidator;
import java.io.InputStream;
import java.util.Scanner;

public class InputHandler {
    private Scanner scanner;

    public InputHandler(InputStream inputStream) {
        scanner = new Scanner(inputStream);
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

    public Category getCategory(TypeCategory typeCategory) {
        return switch (typeCategory) {
            case ANIMAL -> new Animal();
            case COLOR -> new Color();
            case COUNTRY -> new Country();
            case FRUIT -> new Fruit();
            case SPORT -> new Sport();
        };
    }
}
