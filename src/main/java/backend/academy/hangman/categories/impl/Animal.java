package backend.academy.hangman.categories.impl;

import backend.academy.hangman.categories.Category;

public class Animal extends Category {

    static {
        russianEasyWords = new String[] {
            "Кот", "Пёс", "Лев", "Волк", "Сова",
            "Еж", "Тигр", "Заяц", "Краб",
            "Лось", "Гусь", "Мед"
        };

        russianMediumWords = new String[] {
            "Бобр", "Осёл", "Лиса", "Панда",
            "Попугай", "Кролик", "Ягуар", "Лосось",
            "Бизон", "Тунец", "Пингвин", "Зебра"
        };

        russianHardWords = new String[] {
            "Крокодил", "Аллигатор", "Шимпанзе", "Броненосец", "Горилла",
            "Орангутан", "Гепард", "Коала",
            "Антилопа", "Хамелеон", "Бегемот", "Пантера"
        };

    }
}
