package backend.academy.hangman;

import backend.academy.hangman.exceptions.NonLevelNumberException;
import lombok.Getter;
import java.util.Random;

@Getter
public enum Level {
    EASY("Легко"),
    MEDIUM("Средне"),
    HARD("Сложно");

    private String title;
    private static final int size = Level.values().length;

    Level(String title){
        this.title = title;
    }
    public static Level fromNumber(int num){
        if(num < 1 || num > Level.values().length){
            throw new NonLevelNumberException();
        }
        return Level.values()[num - 1];
    }

    public static Level random(){
        Random random = new Random();
        int value = random.nextInt(size) + 1;
        return Level.fromNumber(value);
    }
}
