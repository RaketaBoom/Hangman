package backend.academy.hangman;

import java.io.PrintStream;
import java.util.Set;

public class ConsoleDisplay {
    private PrintStream stream;

    public ConsoleDisplay(PrintStream stream) {
        this.stream = stream;
    }

    public void gameRules(int maxAttempts) {
        stream.println("  _    _                                         ");
        stream.println(" | |  | |                                        ");
        stream.println(" | |__| | __ _ _ __   __ _ _ __ ___   __ _ _ __  ");
        stream.println(" |  __  |/ _` | '_ \\ / _` | '_ ` _ \\ / _` | '_ \\ ");
        stream.println(" | |  | | (_| | | | | (_| | | | | | | (_| | | | |");
        stream.println(" |_|  |_|\\__,_|_| |_|\\__, |_| |_| |_|\\__,_|_| |_|");
        stream.println("                     __/ |                      ");
        stream.println("                    |___/                       ");
        stream.println();
        stream.println("Добро пожаловать в игру Виселица! Вот правила:");
        stream.println("1. Угадывайте по одной букве за раз.");
        stream.println("2. Количество неверных попыток = " + maxAttempts);
        stream.println("3. Если вы угадаете слово до того, как висельник будет полностью нарисован, вы победите.");
        stream.println("4. Если висельник будет нарисован полностью, вы проиграете.");
    }

    public void choiceCategory() {
        stream.println();
        stream.println("Пожайлуйста, выберите категорию из доступных:");
        stream.println("1. Животные     2. Цвета     3. Страны");
        stream.println("4. Фрукты       5. Спорт");
        stream.println("Укажите номер категории: ");
    }

    public void showCategory(TypeCategory category) {
        stream.println();
        stream.println("Выбрана категория: " + category.title());
    }

    public void choiceLevel() {
        stream.println();
        stream.println("Выберите сложность игры:");
        stream.println("1. Легко");
        stream.println("2. Средне");
        stream.println("3. Тяжело");

    }

    public void showLevel(Level level) {
        stream.println();
        stream.println("Выбран уровень сложности: " + level.title());
    }

    public void startGame() {
        stream.println();
        stream.println("Игра началась!");
    }

    public void usedLetters(Set<Character> letters) {
        stream.println();
        stream.print("Вы использовали следующие буквы: ");
        letters
            .forEach(letter -> stream.print(letter + ", "));
    }

    public void maskedWord(char[] word) {
        stream.println();
        stream.println("На данный момент слово выглядит вот так: " + String.valueOf(word));
    }

    public void hangmanState(HangmanState state) {
        stream.println();
        stream.println(state.image());
    }

    public void enterLetter() {
        stream.println();
        stream.println("Введите ваше предположение: ");
    }

    public void usedLetter() {
        stream.println();
        stream.println("Вы уже вводили эту букву");
    }

    public void letterGuessed(char t) {
        stream.println();
        stream.println("Вы угадали букву: " + t);
    }

    public void win(char[] word) {
        stream.println();
        stream.println("Победа!");
        stream.println("Вы угадали слово: " + String.valueOf(word));
    }

    public void lose(char[] word) {
        stream.println();
        stream.println("Поражение!");
        stream.println("Вы не угадали слово: " + String.valueOf(word));
    }

    public void errorMessage(String message) {
        stream.println(message);
    }

}
