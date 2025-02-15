package backend.academy.hangman.categories.impl;

import backend.academy.hangman.Level;
import backend.academy.hangman.categories.Category;
import java.util.Map;
import java.util.Random;
import static java.util.Map.entry;

public class Fruit extends Category {

    public Fruit(Level level, Random random) {
        super(level, random);
    }

    static {
        easyWordsAndHints = Map.ofEntries(
            entry("Киви", "Зеленый фрукт с волосками на кожуре."),
            entry("Груша", "Фрукт с характерной грушевидной формой."),
            entry("Манго", "Сладкий тропический фрукт, часто используется в десертах."),
            entry("Банан", "Долгий желтый фрукт, который легко очищается."),
            entry("Лимон", "Кислый фрукт, часто используется для приготовления лимонада."),
            entry("Лайм", "Маленький зеленый цитрус, часто добавляется в коктейли.")
        );

        mediumWordsAndHints = Map.ofEntries(
            entry("Авокадо", "Фрукт, богатый жирами, часто используется в салатах и гуакамоле."),
            entry("Мандарин", "Цитрус, который легко очищается и имеет сладкий вкус."),
            entry("Абрикос", "Маленький оранжевый фрукт с косточкой, часто используется в варенье."),
            entry("Апельсин", "Популярный цитрус, известный своим сладким вкусом и витамином C.")
        );

        hardWordsAndHints = Map.ofEntries(
            entry("Грейпфрут", "Цитрус с горьковато-сладким вкусом, часто употребляется на завтрак."),
            entry("Маракуйя", "Экзотический фрукт с яркой кожурой и сочной мякотью."),
            entry("Мушмула", "Фрукт с кисло-сладким вкусом, напоминающий комбинацию яблока и груши."),
            entry("Мангустин", "Королева фруктов, с толстой фиолетовой кожурой и сладкой мякотью.")
        );
    }

}

