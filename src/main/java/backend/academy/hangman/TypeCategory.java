package backend.academy.hangman;

import backend.academy.hangman.exceptions.NonCategoryNumberException;

public enum TypeCategory {
    ANIMAL,
    COLOR,
    COUNTRY,
    FRUIT,
    SPORT;

    public static TypeCategory fromNumber(int num){
        if(num < 1 || num > TypeCategory.values().length){
            throw new NonCategoryNumberException();
        }

        return TypeCategory.values()[num - 1];
    }
}
