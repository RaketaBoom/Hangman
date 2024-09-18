package backend.academy.hangman.categories.impl;

import backend.academy.hangman.categories.Category;

public class Fruit extends Category {

    static {
        russianEasyWords = new String[] {
            "Яблоко", "Груша", "Слива", "Лимон", "Киви"
        };

        russianMediumWords = new String[] {
            "Грейпфрут", "Манго", "Мандарин", "Апельсин", "Папайя",
            "Абрикос", "Авокадо",
            "Гуава", "Фейхоа", "Дуриан", "Персик"
        };

        russianHardWords = new String[] {
            "Черимойя", "Мангустин", "Карамбола", "Мушмула", "Кумкват",
            "Кивано", "Питайя", "Рамбутан",
            "Пепино", "Саподилла"
        };

    }
}

