package backend.academy.hangman.categories.impl;

import backend.academy.hangman.categories.Category;

public class Sport extends Category {

    static {
        englishEasyWords = new String[] {
            "Soccer", "Tennis", "Baseball", "Golf", "Hockey",
            "Rugby", "Boxing", "Cricket", "Skiing",
            "Cycling", "Diving", "Rowing", "Sailing", "Surfing"
        };
        englishMediumWords = new String[] {
            "Basketball", "Volleyball", "Badminton", "Wrestling", "Gymnastics",
            "Triathlon",   "Fencing", "Judo",
            "Handball", "Softball"
        };
        englishHardWords = new String[] {
            "Synchronised Swimming", "Ultimate Frisbee", "Bobsledding", "Pentathlon",
            "Bandy", "Water Polo",
        };
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

