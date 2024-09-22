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

    private static final int SIZE = TypeCategory.values().length;
    private final String title;

    TypeCategory(String title) {
        this.title = title;
    }

    public static TypeCategory valueOf(int num) {
        if (num < 1 || num > TypeCategory.values().length) {
            throw new NonCategoryNumberException();
        }

        return TypeCategory.values()[num - 1];
    }

    public static TypeCategory random() {
        Random random = new Random();
        int value = random.nextInt(SIZE) + 1;
        return TypeCategory.valueOf(value);
    }
}
