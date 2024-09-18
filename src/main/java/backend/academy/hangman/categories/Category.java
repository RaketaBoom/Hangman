package backend.academy.hangman.categories;

import backend.academy.hangman.Level;
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

}
