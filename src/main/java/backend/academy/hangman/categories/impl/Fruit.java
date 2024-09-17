package backend.academy.hangman.categories.impl;

import backend.academy.hangman.categories.Category;

public class Fruit extends Category {

    static {
        englishEasyWords = new String[] {
            "Apple", "Lemon",
            "Mango", "Plum", "Pear", "Fig",
            "Kiwi", "Lime"
        };
        englishMediumWords = new String[] {
            "Orange", "Papaya", "Pineapple", "Avocado", "Melon",
            "Raspberry", "Blueberry"
        };
        englishHardWords = new String[] {
            "Pomegranate", "Kumquat", "Rhubarb",
            "Starfruit", "Pomelo", "Cherimoya", "Mangosteen", "Feijoa"
        };
        russianEasyWords = new String[] {
            "Яблоко", "Груша", "Слива", "Лимон", "Киви"
        };

        russianMediumWords = new String[] {
            "Грейпфрут", "Манго", "Мандарин", "Апельсин", "Папайя",
            "Карамбола", "Абрикос", "Авокадо",
            "Гуава", "Фейхоа", "Дуриан", "Персик"
        };

        russianHardWords = new String[] {
            "Черимойя", "Мангустин", "Карамбола", "Мушмула", "Кумкват",
            "Кивано", "Питайя", "Рамбутан",
            "Пепино", "Саподилла"
        };

    }
}

