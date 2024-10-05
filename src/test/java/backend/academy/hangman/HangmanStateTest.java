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
        //Arrange
        int i = 1;

        //Act
        HangmanState actualState = HangmanState.getState(i);

        //Assert
        assertEquals(HangmanState.STATE_1, actualState);
    }

    @Test
    void testGetStateForInBoundsNumber2() {
        //Arrange
        int i = 3;

        //Act
        HangmanState actualState = HangmanState.getState(i);

        //Assert
        assertEquals(HangmanState.STATE_3, actualState);
    }

    @Test
    void testGetStateForInBoundsNumber3() {
        //Arrange
        int i = 9;

        //Act
        HangmanState actualState = HangmanState.getState(i);

        //Assert
        assertEquals(HangmanState.STATE_9, actualState);
    }
}
