package backend.academy.hangman.categories.impl;

import backend.academy.hangman.Level;
import backend.academy.hangman.categories.Category;
import java.util.Map;
import static java.util.Map.entry;

public class Country extends Category {
    public Country(Level level) {
        super(level);
    }

    static {
        easyWordsAndHints = Map.ofEntries(
            entry("Россия", "Наша держава"),
            entry("США", "Голливуд"),
            entry("Польша", "Бобр курва"),
            entry("Италия", "Пицца"),
            entry("Грузия", "Хорошее настроение и вино"),
            entry("Чили", "Длинная страна на юге Америки")
        );

        mediumWordsAndHints = Map.ofEntries(
            entry("Германия", "Баварское пиво"),
            entry("Румыния", "Там живет граф Дракула"),
            entry("Финляндия", "Страна тысячи озер"),
            entry("Испания", "Коррида"),
            entry("Вьетнам", "Джонни, они на деревьях!"),
            entry("Франция", "Родина багетов")
        );

        hardWordsAndHints = Map.ofEntries(
            entry("Амстердам", "Города каналов и велосипедов"),
            entry("Казахстан", "Родина Нурлана Сабурова"),
            entry("Австралия", "Страна кенгуру и коал"),
            entry("Люксембург", "Маленькое, но богатое государство"),
            entry("Сингапур", "Город-остров с небоскребами"),
            entry("Швейцария", "Самые надежные банки")
        );
    }
}
