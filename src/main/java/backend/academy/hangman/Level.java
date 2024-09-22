package backend.academy.hangman;

import backend.academy.hangman.exceptions.NonLevelNumberException;
import java.util.Random;
import lombok.Getter;

@Getter
public enum Level {
    EASY("Легко"),
    MEDIUM("Средне"),
    HARD("Сложно");

    private static final int SIZE = Level.values().length;

    private final String title;

    Level(String title) {
        this.title = title;
    }

    public static Level valueOf(int num) {
        if (num < 1 || num > Level.values().length) {
            throw new NonLevelNumberException();
        }
        return Level.values()[num - 1];
    }

    public static Level random() {
        Random random = new Random();
        int value = random.nextInt(SIZE) + 1;
        return Level.valueOf(value);
    }
}
