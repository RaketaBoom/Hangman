package backend.academy.hangman.categories.impl;

import backend.academy.hangman.categories.Category;

public class Color extends Category {

    static {
        russianEasyWords = new String[] {
            "Синий", "Белый", "Красный", "Черный"
        };

        russianMediumWords = new String[] {
            "Пурпурный", "Малиновый", "Бордовый", "Фиолетовый"
        };

        russianHardWords = new String[] {
            "Аквамарин", "Изумрудный", "Розовый", "Кремовый"
        };

    }
}

