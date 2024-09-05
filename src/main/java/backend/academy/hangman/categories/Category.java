package backend.academy.hangman.categories;

import backend.academy.hangman.Level;
import java.util.Random;

public abstract class Category {
    protected static String[] easyWords;
    protected static String[] mediumWords;
    protected static String[] hardWords;

    public String getRandomWord(Level level){
        Random random = new Random();
        return switch (level) {
            case EASY -> easyWords[random.nextInt(easyWords.length)];
            case MEDIUM -> mediumWords[random.nextInt(mediumWords.length)];
            case HARD -> hardWords[random.nextInt(hardWords.length)];
        };
    }

}
