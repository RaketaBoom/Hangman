package backend.academy.hangman.categories.impl;

import backend.academy.hangman.categories.Category;

public class Animal extends Category {

    static {
        englishEasyWords = new String[]{
            "Cat", "Dog", "Lion", "Bear", "Wolf",
            "Crab", "Ant", "Frog", "Duck", "Hawk",
            "Fish", "Deer", "Goat", "Bat", "Swan"
        };
        englishMediumWords = new String[]{
            "Beaver", "Gopher", "Donkey", "Jaguar", "Parrot",
            "Rabbit", "Salmon", "Turtle", "Ocelot", "Bison",
            "Lobster", "Panda", "Cheetah", "Penguin", "Giraffe"
        };
        englishHardWords = new String[]{
            "Elephant", "Giraffe", "Kangaroo", "Rhinoceros", "Alligator",
            "Chimpanzee", "Ostrich", "Gorilla", "Armadillo", "Crocodile",
            "Cheetah", "Penguin", "Rottweiler", "Hippopotamus", "Orangutan"
        };
        russianEasyWords = new String[]{
            "Кот", "Пёс", "Лев", "Волк", "Сова",
            "Еж", "Тигр", "Заяц", "Лось", "Краб",
            "Ант", "Лось", "Гусь", "Мед", "Скунс"
        };

        russianMediumWords = new String[]{
            "Бобр", "Осёл", "Лиса", "Гусь", "Панда",
            "Попугай", "Кролик", "Ягуар", "Гусь", "Лосось",
            "Бизон", "Пума", "Тунец", "Пингвин", "Зебра"
        };

        russianHardWords = new String[]{
            "Крокодил", "Аллигатор", "Шимпанзе", "Броненосец", "Горилла",
            "Орангутан", "Хамелеон", "Гепард", "Коала", "Острич",
            "Антилопа", "Хамелеон", "Бегемот", "Пантера", "Жираф"
        };

    }
}
