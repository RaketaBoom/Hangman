package backend.academy.hangman.categories.impl;

import backend.academy.hangman.Level;
import backend.academy.hangman.categories.Category;
import java.util.Map;
import static java.util.Map.entry;

public class Color extends Category {
    public Color(Level level) {
        super(level);
    }

    static {
        easyWordsAndHints = Map.ofEntries(
            entry("Белый", "RGB(255, 255, 255)"),
            entry("Чёрный", "Цвет ночи и угля"),
            entry("Синий", "Цвет настроения"),
            entry("Серый", "50 оттенков..."),
            entry("Хаки", "Военная форма НАТО"),
            entry("Жёлтый", "Солнышко")
        );

        mediumWordsAndHints = Map.ofEntries(
            entry("Оранжевый", "Апельсин"),
            entry("Красный", "Цвет любви и страсти"),
            entry("Голубой", "Нетрадиционный"),
            entry("Розовый", "Цвет настоящей принесски"),
            entry("Бордовый", "Темный оттенок красного, часто используется в винах"),
            entry("Лиловый", "Цвет лаванды и фиалок")
        );

        hardWordsAndHints = Map.ofEntries(
            entry("Фиолетовый", "Танос"),
            entry("Пурпурный", "Цвет, который был популярен среди римских императоров"),
            entry("Кремовый", "Мягкий цвет, напоминающий о сливках"),
            entry("Коричневый", "Цвет шоколада и кофе"),
            entry("Салатовый", "Нежный цвет, напоминающий о свежих овощах"),
            entry("Бирюзовый", "Цвет тропических вод")
        );
    }
}

