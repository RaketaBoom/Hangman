package backend.academy.hangman;

import backend.academy.hangman.exceptions.InvalidHangmanStateException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class HangmanStateTest {

    @ParameterizedTest
    @ValueSource(ints = {0, -21, 10, 232, 99})
    void testGetStateForOutOfBoundsNumber(int i) {
        assertThrows(InvalidHangmanStateException.class, () -> HangmanState.getState(i));
    }

    @Test
    void testGetStateForInBoundsNumber1() {
        int i = 1;

        HangmanState actualState = HangmanState.getState(i);

        HangmanState expectedState = HangmanState.STATE_1;
        assertEquals(expectedState, actualState);
    }

    @Test
    void testGetStateForInBoundsNumber2() {
        int i = 3;

        HangmanState actualState = HangmanState.getState(i);

        HangmanState expectedState = HangmanState.STATE_3;
        assertEquals(expectedState, actualState);
    }

    @Test
    void testGetStateForInBoundsNumber3() {
        int i = 9;

        HangmanState actualState = HangmanState.getState(i);

        HangmanState expectedState = HangmanState.STATE_9;
        assertEquals(expectedState, actualState);
    }
}
