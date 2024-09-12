package backend.academy.hangman;

import backend.academy.hangman.exceptions.NonCategoryNumberException;
import lombok.Getter;

@Getter
public enum TypeCategory {
    ANIMAL("Животные"),
    COLOR("Цвета"),
    COUNTRY("Страны"),
    FRUIT("Фрукты"),
    SPORT("Спорт");

    private String title;

    TypeCategory(String title){
        this.title = title;
    }

    public static TypeCategory fromNumber(int num){
        if(num < 1 || num > TypeCategory.values().length){
            throw new NonCategoryNumberException();
        }

        return TypeCategory.values()[num - 1];
    }
}
