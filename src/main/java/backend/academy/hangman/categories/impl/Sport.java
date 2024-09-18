package backend.academy.hangman.categories.impl;

import backend.academy.hangman.categories.Category;

public class Sport extends Category {

    static {
        russianEasyWords = new String[] {
            "Футбол", "Теннис", "Хоккей", "Бокс", "Гольф",
            "Дзюдо", "Бег", "Шахматы"
        };

        russianMediumWords = new String[] {
            "Бейсбол", "Крикет", "Прыжки", "Сёрфинг", "Волейбол", "Плавание",
        };

        russianHardWords = new String[] {
            "Баскетбол", "Фехтование"
        };

    }
}

