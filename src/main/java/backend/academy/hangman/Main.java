package backend.academy.hangman;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class Main {
    /**
     * The Start class is the entry point of the Hangman game.
     * It creates an instance of the Game and starts it.
     */
    public static void main(String[] args) {
        Game game = new Game(System.in, System.out);
        game.start();
    }
}
