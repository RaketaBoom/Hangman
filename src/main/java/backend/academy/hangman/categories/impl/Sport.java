package backend.academy.hangman.categories.impl;

import backend.academy.hangman.categories.Category;

public class Sport extends Category {

    static {
        englishEasyWords = new String[]{
            "Soccer", "Tennis", "Baseball", "Golf", "Hockey",
            "Rugby", "Boxing", "Cricket", "Table Tennis", "Skiing",
            "Cycling", "Diving", "Rowing", "Sailing", "Surfing"
        };
        englishMediumWords = new String[]{
            "Basketball", "Volleyball", "Badminton", "Wrestling", "Gymnastics",
            "Triathlon", "Skateboarding", "Snowboarding", "Fencing", "Judo",
            "Horseback", "Lacrosse", "Curling", "Handball", "Softball"
        };
        englishHardWords = new String[]{
            "Synchronised Swimming", "Ultimate Frisbee", "Bobsledding", "Korfball", "Pentathlon",
            "Sepak Takraw", "Bandy", "Water Polo", "Floorball", "Dodgeball",
            "Synchronized Swimming", "Triathlon", "Modern Pentathlon", "Orienteering", "Luge"
        };
        russianEasyWords = new String[]{
            "Футбол", "Теннис", "Хоккей", "Бокс", "Гольф",
            "Регби", "Бег", "Шахматы", "Бейсбол", "Крикет",
            "Прыжки", "Сёрфинг", "Волейбол", "Плавание", "Фехтование"
        };

        russianMediumWords = new String[]{
            "Баскетбол", "Триатлон", "Сноуборд", "Каратэ", "Борьба",
            "Тяжёлая", "Конькобежный", "Кёрлинг", "Фигурное", "Самбо",
            "Лыжный", "Бадминтон", "Гребля", "Гимнастика", "Прыжки"
        };

        russianHardWords = new String[]{
            "Пятиборье", "Синхронное", "Флорбол", "Бобслей", "Кроссфит",
            "Виндсёрфинг", "Капоэйра", "Организованный", "Чирлидинг", "Мотокросс",
            "Скелетон", "Сепактакрау", "Крикет", "Гимнастика", "Родео"
        };

    }
}

