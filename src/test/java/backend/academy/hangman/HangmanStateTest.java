package backend.academy.hangman;

import backend.academy.hangman.exceptions.InvalidHangmanStateException;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class HangmanStateTest {

    @ParameterizedTest
    @ValueSource(ints = {0, -21, 10, 232, 99})
    void getStateForOutOfBoundsNumber(int i) {
        assertThrows(InvalidHangmanStateException.class, () -> HangmanState.getState(i));
    }

    @Test
    void getStateForInBoundsNumber1() {
        int i = 1;

        HangmanState actualState = HangmanState.getState(i);

        HangmanState expectedState = HangmanState.STATE_1;
        assertEquals(actualState, expectedState);
    }

    @Test
    void getStateForInBoundsNumber2() {
        int i = 3;

        HangmanState actualState = HangmanState.getState(i);

        HangmanState expectedState = HangmanState.STATE_3;
        assertEquals(actualState, expectedState);
    }

    @Test
    void getStateForInBoundsNumber3() {
        int i = 9;

        HangmanState actualState = HangmanState.getState(i);

        HangmanState expectedState = HangmanState.STATE_9;
        assertEquals(actualState, expectedState);
    }
}
