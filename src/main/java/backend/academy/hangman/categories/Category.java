package backend.academy.hangman.categories;

import backend.academy.hangman.Level;
import java.util.Random;

public abstract class Category {
    protected static String[] englishEasyWords;
    protected static String[] englishMediumWords;
    protected static String[] englishHardWords;

    protected static String[] russianEasyWords;
    protected static String[] russianMediumWords;
    protected static String[] russianHardWords;

    public String getEnglishRandomWord(Level level){
        Random random = new Random();
        return switch (level) {
            case EASY -> englishEasyWords[random.nextInt(englishEasyWords.length)];
            case MEDIUM -> englishMediumWords[random.nextInt(englishMediumWords.length)];
            case HARD -> englishHardWords[random.nextInt(englishHardWords.length)];
        };
    }

    public String getRussianRandomWord(Level level){
        Random random = new Random();
        return switch (level) {
            case EASY -> russianEasyWords[random.nextInt(russianEasyWords.length)];
            case MEDIUM -> russianMediumWords[random.nextInt(russianMediumWords.length)];
            case HARD -> russianHardWords[random.nextInt(russianHardWords.length)];
        };
    }

}
