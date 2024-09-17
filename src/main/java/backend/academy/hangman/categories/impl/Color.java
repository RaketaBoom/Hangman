package backend.academy.hangman.categories.impl;

import backend.academy.hangman.categories.Category;

public class Color extends Category {

    static {
        englishEasyWords = new String[] {
            "Red", "Blue", "Pink", "Gray"
        };
        englishMediumWords = new String[] {
            "Purple", "Orange", "Silver", "Bronze"
        };
        englishHardWords = new String[] {
            "Aquamarine", "Periwinkle", "Chartreuse", "Vermilion"
        };

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

