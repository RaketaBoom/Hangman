package backend.academy.hangman;

import java.io.PrintStream;
import java.util.Set;

public class ConsoleDisplay {
    private PrintStream stream;

    public ConsoleDisplay(PrintStream stream) {
        this.stream = stream;
    }

    public void gameRules(int maxAttempts, int attemptsWithoutHint) {
        stream.printf("  _    _                                         %n");
        stream.printf(" | |  | |                                        %n");
        stream.printf(" | |__| | __ _ _ __   __ _ _ __ ___   __ _ _ __  %n");
        stream.printf(" |  __  |/ _` | '_ \\ / _` | '_ ` _ \\ / _` | '_ \\ %n");
        stream.printf(" | |  | | (_| | | | | (_| | | | | | | (_| | | | |%n");
        stream.printf(" |_|  |_|\\__,_|_| |_|\\__, |_| |_| |_|\\__,_|_| |_|%n");
        stream.printf("                     __/ |                      %n");
        stream.printf("                    |___/                       %n%n");
        stream.printf("Добро пожаловать в игру Виселица! Вот правила:%n");
        stream.printf("1. Угадывайте по одной букве за раз.%n");
        stream.printf("2. Количество неверных попыток = %d%n", maxAttempts);
        stream.printf("3. После %d попытки появится подсказка%n", attemptsWithoutHint);
        stream.printf("4. Если вы угадаете слово до того, как висельник будет полностью нарисован, вы победите.%n");
        stream.printf("5. Если висельник будет нарисован полностью, вы проиграете.%n");
    }

    public void choiceCategory() {
        stream.printf("%nПожалуйста, выберите категорию из доступных:%n");
        stream.printf("1. Животные     2. Цвета     3. Страны%n");
        stream.printf("4. Фрукты       5. Спорт%n");
        stream.printf("Укажите номер категории: %n");
    }

    public void category(TypeCategory category) {
        stream.printf("%nВыбрана категория: %s%n", category.title());
    }

    public void choiceLevel() {
        stream.printf("%nВыберите сложность игры:%n");
        stream.printf("1. Легко%n");
        stream.printf("2. Средне%n");
        stream.printf("3. Тяжело%n");
    }

    public void level(Level level) {
        stream.printf("%nВыбран уровень сложности: %s%n", level.title());
    }

    public void startGame() {
        stream.printf("%nИгра началась!%n");
    }

    public void usedLetters(Set<Character> letters) {
        stream.printf("%nВы использовали следующие буквы: ");
        letters.forEach(letter -> stream.printf("%s, ", letter));
    }

    public void maskedWord(char[] word) {
        stream.printf("%nНа данный момент слово выглядит вот так: %s%n", String.valueOf(word));
    }

    public void hangmanState(HangmanState state) {
        stream.printf("%n%s%n", state.image());
    }

    public void hint(String text) {
        stream.printf("%nПодсказка: %s%n", text);
    }

    public void enterLetter() {
        stream.printf("%nВведите ваше предположение: %n");
    }

    public void usedLetter() {
        stream.printf("%nВы уже вводили эту букву%n");
    }

    public void letterGuessed(char t) {
        stream.printf("%nВы угадали букву: %c%n", t);
    }

    public void win(String word) {
        stream.printf("%nПобеда!%n");
        stream.printf("Вы угадали слово: %s%n", word);
    }

    public void lose(String word) {
        stream.printf("%nПоражение!%n");
        stream.printf("Вы не угадали слово: %s%n", word);
    }

    public void errorMessage(String message) {
        stream.printf("%s%n", message);
    }

}
