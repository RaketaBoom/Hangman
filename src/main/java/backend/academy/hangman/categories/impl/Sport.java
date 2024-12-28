package backend.academy.hangman.categories.impl;

import backend.academy.hangman.Level;
import backend.academy.hangman.categories.Category;
import java.util.Map;
import java.util.Random;
import static java.util.Map.entry;

public class Sport extends Category {
    public Sport(Level level, Random random) {
        super(level, random);
    }

    static {
        easyWordsAndHints = Map.ofEntries(
            entry("Футбол", "Популярная командная игра с мячом."),
            entry("Гольф", "Игра с мячом и клюшками на большом поле."),
            entry("Хоккей", "Игра на льду с шайбой и клюшками."),
            entry("Бокс", "Спортивное единоборство, в котором соперники бьют друг друга кулаками.")
        );

        mediumWordsAndHints = Map.ofEntries(
            entry("Волейбол", "Игра, в которой команды перебрасывают мяч через сетку."),
            entry("Шахматы", "Настольная стратегическая игра для двух игроков."),
            entry("Крикет", "Командный вид спорта, популярный в Великобритании и Индии."),
            entry("Сёрфинг", "Спорт, связанный с катанием на волнах на доске.")
        );

        hardWordsAndHints = Map.ofEntries(
            entry("Баскетбол", "Игра с мячом, где команды пытаются забросить мяч в корзину."),
            entry("Фехтование", "Спортивное единоборство с использованием мечей."),
            entry("Бобслей", "Зимний вид спорта на санях по ледяной трассе."),
            entry("Кёрлинг", "Спорт, где игроки скользят камнями по льду к цели.")
        );
    }
}

