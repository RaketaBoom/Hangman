package backend.academy.hangman;

import backend.academy.hangman.exceptions.NonCategoryNumberException;
import java.util.Random;
import lombok.Getter;

@Getter
public enum TypeCategory {
    ANIMAL("Животные"),
    COLOR("Цвета"),
    COUNTRY("Страны"),
    FRUIT("Фрукты"),
    SPORT("Спорт");

    private String title;
    private static final int size = TypeCategory.values().length;

    TypeCategory(String title) {
        this.title = title;
    }

    public static TypeCategory fromNumber(int num) {
        if (num < 1 || num > TypeCategory.values().length) {
            throw new NonCategoryNumberException();
        }

        return TypeCategory.values()[num - 1];
    }

    public static TypeCategory random() {
        Random random = new Random();
        int value = random.nextInt(size) + 1;
        return TypeCategory.fromNumber(value);
    }
}
