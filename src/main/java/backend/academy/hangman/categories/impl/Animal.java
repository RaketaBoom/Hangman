package backend.academy.hangman.categories.impl;

import backend.academy.hangman.Level;
import backend.academy.hangman.categories.Category;
import java.util.Map;
import static java.util.Map.entry;

public class Animal extends Category {
    public Animal(Level level) {
        super(level);
    }

    static {
        easyWordsAndHints = Map.ofEntries(
            entry("Кот", "Милый и пушистый"),
            entry("Заяц", "Косой"),
            entry("Волк", "Серый"),
            entry("Лиса", "Хитрая"),
            entry("Тигр", "Полосатый"),
            entry("Конь", "Буцефал")
        );

        mediumWordsAndHints = Map.ofEntries(
            entry("Ягуар", "Самый быстрый и мощный представитель семейства кошачьих в тропических лесах"),
            entry("Бизон", "Бык с Северной Америки"),
            entry("Зебра", "Животное с черно-белыми полосками"),
            entry("Панда", "Знает Кунг-Фу"),
            entry("Лосось", "Рыбка такая"),
            entry("Коала", "Живет в австралии, питается листьями эвкалипта")
        );

        hardWordsAndHints = Map.ofEntries(
            entry("Крокодил", "Гена, играет на гармошке"),
            entry("Хамелеон", "Меняет цвет"),
            entry("Горилла", "Крупная обезьяна"),
            entry("Пингвин", "Живет в Антарктиде"),
            entry("Бегемот", "Герой \"Мото-мото\" из \"Мадагаскара\""),
            entry("Пантера", "Черная хищная кошка")
        );

    }
}
