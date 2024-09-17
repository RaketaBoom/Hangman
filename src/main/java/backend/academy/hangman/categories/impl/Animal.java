package backend.academy.hangman.categories.impl;

import backend.academy.hangman.categories.Category;

public class Animal extends Category {

    static {
        englishEasyWords = new String[] {
            "Cat", "Dog", "Lion", "Bear", "Wolf",
            "Crab", "Ant", "Frog", "Duck", "Hawk",
            "Fish", "Deer", "Goat", "Bat", "Swan"
        };
        englishMediumWords = new String[] {
            "Beaver", "Gopher", "Donkey", "Jaguar", "Parrot",
            "Rabbit", "Salmon", "Turtle", "Ocelot", "Bison",
            "Lobster", "Panda", "Cheetah", "Penguin", "Giraffe"
        };
        englishHardWords = new String[] {
            "Elephant", "Kangaroo", "Rhinoceros", "Alligator",
            "Chimpanzee", "Ostrich", "Gorilla", "Armadillo", "Crocodile",
            "Hippopotamus", "Orangutan"
        };
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
