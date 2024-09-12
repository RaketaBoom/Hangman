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
    private String image;

    HangmanState(String image){
        this.image = image;
    }

    public static HangmanState getState(int i){
        return switch (i){
            case 1 -> STATE_1;
            case 2 -> STATE_2;
            case 3 -> STATE_3;
            case 4 -> STATE_4;
            case 5 -> STATE_5;
            case 6 -> STATE_6;
            case 7 -> STATE_7;
            case 8 -> STATE_8;
            case 9 -> STATE_9;
            default -> throw new InvalidHangmanStateException();
        };
    }
}
