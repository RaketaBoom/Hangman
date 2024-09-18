package backend.academy.hangman;

public final class Main {
    private Main() {
    }

    /**
     * The Start class is the entry point of the Hangman game.
     * It creates an instance of the Game and starts it.
     */
    public static void main(String[] args) { //The Start class is the entry point of the Hangman game.
        Game game = new Game(System.in, System.out); //It creates an instance of the Game and starts it.
        game.start();
    }
}
