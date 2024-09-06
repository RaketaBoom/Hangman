package backend.academy.hangman.categories.impl;

import backend.academy.hangman.categories.Category;

public class Country extends Category {

    static {
        englishEasyWords = new String[]{
            "India", "China", "Japan", "Italy",
            "Spain", "Nepal" , "Canada",
            "Chile", "Peru", "Iraq", "Qatar", "Oman"
        };
        englishMediumWords = new String[]{
            "Canada", "France",  "Greece", "Denmark",
            "Thailand", "Germany", "Portugal", "Poland", "Morocco",
            "Hungary", "Pakistan", "Croatia", "Belgium"
        };
        englishHardWords = new String[]{
            "Liechtenstein", "Czechia", "San Marino", "Guinea-Bissau", "Turkmenistan",
            "Mozambique", "Bosnia and Herzegovina", "North Macedonia", "Kyrgyzstan", "Vatican",
            "Papua New Guinea", "Tajikistan", "Brunei"
        };
        russianEasyWords = new String[]{
            "Индия", "Китай", "Чили", "Перу", "Ливан",
            "Оман", "Иран", "Катар", "Канада", "Гана",
            "Япония", "Франция", "Ливия", "Чехия", "Греция"
        };

        russianMediumWords = new String[]{
            "Испания", "Польша", "Норвегия", "Германия", "Мексика",
            "Турция", "Швеция", "Гондурас", "Аргентина", "Хорватия",
            "Беларусь", "Дания", "Португалия", "Нидерланды", "Сербия"
        };

        russianHardWords = new String[]{
            "Лихтенштейн", "Киргизия", "Таджикистан", "Туркмения", "Сан-Марино",
            "Папуа", "Сейшелы", "Гвинея-Бисау", "Ватикан", "Мозамбик",
            "Филиппины", "Камбоджа", "Босния", "Эритрея", "Сьерра-Леоне"
        };

    }
}
