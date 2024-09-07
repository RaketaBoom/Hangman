package backend.academy.hangman;

import backend.academy.hangman.categories.Category;
import backend.academy.hangman.categories.impl.Animal;
import backend.academy.hangman.categories.impl.Color;
import backend.academy.hangman.categories.impl.Country;
import backend.academy.hangman.categories.impl.Fruit;
import backend.academy.hangman.categories.impl.Sport;
import backend.academy.hangman.exceptions.NonCategoryNumberException;
import backend.academy.hangman.exceptions.NonLevelNumberException;
import backend.academy.hangman.validators.InputValidator;
import java.io.InputStream;
import java.util.Scanner;

public class InputHandler {
    private Scanner scanner;

    public InputHandler(InputStream inputStream) {
        scanner = new Scanner(inputStream);
    }

    public Level getLevel(){
        String input = scanner.nextLine();
        if(!InputValidator.isNumberLevel(input)){
            throw new NonLevelNumberException();
        }
        Level level = Level.fromNumber(Character.getNumericValue(input.charAt(0)));
        return level;
    }

    public Category getCategory() {
        String input = scanner.nextLine();
        if(!InputValidator.isNumberCategory(input)){
            throw new NonCategoryNumberException();
        }
        TypeCategory type = TypeCategory.fromNumber(Character.getNumericValue(input.charAt(0)));
        return selectCategory(type);
    }
    private Category selectCategory(TypeCategory typeCategory){
        return switch (typeCategory){
            case ANIMAL -> new Animal();
            case COLOR -> new Color();
            case COUNTRY -> new Country();
            case FRUIT -> new Fruit();
            case SPORT -> new Sport();
        };
    }
}
