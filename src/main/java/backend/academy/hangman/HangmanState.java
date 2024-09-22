package backend.academy.hangman;

import backend.academy.hangman.exceptions.InvalidHangmanStateException;
import lombok.Getter;

@Getter
public enum HangmanState {

    STATE_1("""
         |
         |
         |
         |
         |
         |______
        """
    ),
    STATE_2("""
         _________
         |/
         |
         |
         |
         |
         |______
        """
    ),
    STATE_3("""
         _________
         |/      |
         |
         |
         |
         |
         |______
        """
    ),
    STATE_4("""
         _________
         |/      |
         |       O
         |
         |
         |
         |______
        """
    ),
    STATE_5("""
         _________
         |/      |
         |       O
         |       |
         |
         |
         |______
        """
    ),
    STATE_6("""
         _________
         |/      |
         |       O
         |       |\\
         |
         |
         |______
        """
    ),
    STATE_7("""
         _________
         |/      |
         |       O
         |      /|\\
         |
         |
         |______
        """
    ),
    STATE_8("""
         _________
         |/      |
         |       O
         |      /|\\
         |      /
         |
         |______
        """
    ),
    STATE_9("""
         _________
         |/      |
         |       O
         |      /|\\
         |      / \\
         |
         |______
        """
    );
    private static final int NUMBER_OF_STATES = HangmanState.values().length;

    private final String image;

    HangmanState(String image) {
        this.image = image;
    }

    public static HangmanState getState(int i) {
        if (i < 1 || i > NUMBER_OF_STATES) {
            throw new InvalidHangmanStateException();
        }
        return HangmanState.values()[i - 1];
    }
}
