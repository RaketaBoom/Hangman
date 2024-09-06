package backend.academy.hangman.categories.impl;

import backend.academy.hangman.categories.Category;

public class Fruit extends Category {

    static {
        englishEasyWords = new String[]{
            "Apple", "Banana", "Cherry", "Grape", "Lemon",
            "Mango", "Peach", "Plum", "Pear", "Fig",
            "Kiwi", "Nuts", "Dates", "Lime", "Coconut"
        };
        englishMediumWords = new String[]{
            "Orange", "Papaya", "Pineapple", "Avocado", "Melon",
            "Raspberry", "Blueberry", "Guava", "Lychee", "Pomegranate",
            "Jackfruit", "Apricot", "Passionfruit", "Cantaloupe", "Tangerine"
        };
        englishHardWords = new String[]{
            "Pomegranate", "Passionfruit", "Blueberry", "Cantaloupe", "Jackfruit",
            "Kumquat", "Rhubarb", "Longan", "Salak", "Durian",
            "Starfruit", "Pomelo", "Cherimoya", "Mangosteen", "Feijoa"
        };
        russianEasyWords = new String[]{
            "Яблоко", "Груша", "Слива", "Лимон", "Киви",
            "Фига", "Лайм", "Хурма", "Вишня", "Дыня",
            "Лук", "Мак", "Личи", "Липа", "Алыча"
        };

        russianMediumWords = new String[]{
            "Грейпфрут", "Манго", "Мандарин", "Апельсин", "Папайя",
            "Малина", "Карамбола", "Абрикос", "Гранат", "Авокадо",
            "Гуава", "Фейхоа", "Дуриан", "Персик", "Арбуз"
        };

        russianHardWords = new String[]{
            "Черимойя", "Мангустин", "Карамбола", "Мушмула", "Кумкват",
            "Кивано", "Питайя",  "Рамбутан", "Капуста",
            "Пепино", "Саподилла",  "Салак", "Морковь"
        };

    }
}

