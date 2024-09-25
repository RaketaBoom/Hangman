package backend.academy.hangman.categories;

import backend.academy.hangman.Level;
import backend.academy.hangman.TypeCategory;
import backend.academy.hangman.Word;
import backend.academy.hangman.categories.impl.Animal;
import backend.academy.hangman.categories.impl.Color;
import backend.academy.hangman.categories.impl.Country;
import backend.academy.hangman.categories.impl.Fruit;
import backend.academy.hangman.categories.impl.Sport;
import java.util.Map;
import java.util.Random;

public class Category {
    private final Random random;
    private final Level level;
    protected static Map<String, String> easyWordsAndHints;
    protected static Map<String, String> mediumWordsAndHints;
    protected static Map<String, String> hardWordsAndHints;

    public Category(Level level, Random random) {
        this.level = level;
        this.random = random;
    }

    public Word getRandomWord() {
        return switch (level) {
            case EASY -> createEasyWord(random);
            case MEDIUM -> createMediumWord(random);
            case HARD -> createHardWord(random);
        };
    }

    public static Category initializeCategory(TypeCategory typeCategory, Level level, Random random) {
        return switch (typeCategory) {
            case ANIMAL -> new Animal(level, random);
            case COLOR -> new Color(level, random);
            case COUNTRY -> new Country(level, random);
            case FRUIT -> new Fruit(level, random);
            case SPORT -> new Sport(level, random);
        };
    }

    private Word createEasyWord(Random random) {
        String[] easyWords = easyWordsAndHints.keySet().toArray(new String[0]);
        String word = easyWords[random.nextInt(easyWords.length)];
        return new Word(word, easyWordsAndHints.get(word));
    }

    private Word createMediumWord(Random random) {
        String[] mediumWords = mediumWordsAndHints.keySet().toArray(new String[0]);
        String word = mediumWords[random.nextInt(mediumWords.length)];
        return new Word(word, mediumWordsAndHints.get(word));
    }

    private Word createHardWord(Random random) {
        String[] hardWords = hardWordsAndHints.keySet().toArray(new String[0]);
        String word = hardWords[random.nextInt(hardWords.length)];
        return new Word(word, hardWordsAndHints.get(word));
    }
}
