package backend.academy.hangman;

import java.io.PrintStream;

public class ConsoleDisplay {
    private PrintStream stream;

    public ConsoleDisplay(PrintStream stream){
        this.stream = stream;
    }

    public void gameRules(){
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
        stream.println("2. У вас ограниченное количество неверных попыток.");
        stream.println("3. Если вы угадаете слово до того, как висельник будет полностью нарисован, вы победите.");
        stream.println("4. Если висельник будет нарисован полностью, вы проиграете.");
    }

    public void choiceCategory(){
        stream.println();
        stream.println("Пожайлуйста, выберите категорию из доступных:");
        stream.println("1. Животные     2. Цвета     3. Страны");
        stream.println("4. Фрукты       5. Спорт");
        stream.println("Укажите номер категории: ");
    }

    public void errorMessage(String message){
        stream.println(message);
    }


}
