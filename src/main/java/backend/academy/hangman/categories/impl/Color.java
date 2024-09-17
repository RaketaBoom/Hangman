package backend.academy.hangman.categories.impl;

import backend.academy.hangman.categories.Category;

public class Color extends Category {

    static {
        englishEasyWords = new String[] {
            "Red", "Blue", "Green", "Pink", "Gray",
            "Gold", "White", "Black", "Teal", "Beige",
            "Cyan", "Maroon", "Navy", "Olive", "Lime"
        };
        englishMediumWords = new String[] {
            "Purple", "Orange", "Silver", "Bronze", "Turquoise",
            "Indigo", "Magenta", "Lavender", "Crimson", "Coral",
            "Aqua", "Ivory", "Khaki", "Peach", "Charcoal"
        };
        englishHardWords = new String[] {
            "Aquamarine", "Periwinkle", "Chartreuse", "Vermilion", "Cerulean",
            "Saffron", "Tangerine", "Fuchsia", "Garnet", "Emerald",
            "Sepia", "Teal", "Raspberry", "Burgundy", "Canary"
        };

        russianEasyWords = new String[] {
            "Красный", "Синий", "Зелёный", "Белый", "Чёрный",
            "Жёлтый", "Серый", "Розовый", "Бирюзовый", "Лаймовый",
            "Золотой", "Сиреневый", "Синий", "Белый"
        };

        russianMediumWords = new String[] {
            "Пурпурный", "Серебристый", "Лавандовый", "Шафран", "Хаки",
            "Персиковый", "Малиновый", "Фуксия", "Сафран", "Бордовый",
            "Лаймовый", "Бирюзовый", "Индиго", "Оливковый"
        };

        russianHardWords = new String[] {
            "Аквамарин", "Антрацитовый", "Оранжевый", "Фиолетовый", "Церулеан",
            "Изумрудный", "Сепия", "Шоколадный", "Розовый",
            "Кремовый", "Шафрановый", "Оливковый", "Малиновый", "Вермильон"
        };

    }
}

