package backend.academy.hangman;

import backend.academy.hangman.exceptions.NonLevelNumberException;

public enum Level {
    EASY,
    MEDIUM,
    HARD;

    public static Level fromNumber(int num){
        if(num < 1 || num > Level.values().length){
            throw new NonLevelNumberException();
        }
        return Level.values()[num - 1];
    }
}
