package backend.academy.hangman;

import backend.academy.hangman.exceptions.NonLevelNumberException;
import lombok.Getter;

@Getter
public enum Level {
    EASY("Легко"),
    MEDIUM("Средне"),
    HARD("Сложно");

    private String title;

    Level(String title){
        this.title = title;
    }
    public static Level fromNumber(int num){
        if(num < 1 || num > Level.values().length){
            throw new NonLevelNumberException();
        }
        return Level.values()[num - 1];
    }
}
