package backend.academy.hangman;

public class Start {
    private Start(){}

    public static void main(String[] args) {
        Game game = new Game(System.in, System.out);
        game.start();
    }
}
