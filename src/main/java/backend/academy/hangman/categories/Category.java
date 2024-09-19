package backend.academy.hangman.categories;

import backend.academy.hangman.Level;
import backend.academy.hangman.TypeCategory;
import backend.academy.hangman.categories.impl.Animal;
import backend.academy.hangman.categories.impl.Color;
import backend.academy.hangman.categories.impl.Country;
import backend.academy.hangman.categories.impl.Fruit;
import backend.academy.hangman.categories.impl.Sport;
import java.util.Random;

public abstract class Category {
    protected static String[] russianEasyWords;
    protected static String[] russianMediumWords;
    protected static String[] russianHardWords;

    public String getRussianRandomWord(Level level) {
        Random random = new Random();
        return switch (level) {
            case EASY -> russianEasyWords[random.nextInt(russianEasyWords.length)];
            case MEDIUM -> russianMediumWords[random.nextInt(russianMediumWords.length)];
            case HARD -> russianHardWords[random.nextInt(russianHardWords.length)];
        };
    }

    public static Category getCategory(TypeCategory typeCategory) {
        return switch (typeCategory) {
            case ANIMAL -> new Animal();
            case COLOR -> new Color();
            case COUNTRY -> new Country();
            case FRUIT -> new Fruit();
            case SPORT -> new Sport();
        };
    }

}
