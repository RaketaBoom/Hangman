package backend.academy.hangman;

import backend.academy.hangman.exceptions.NonLevelNumberException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LevelTest {

    @Test
    void testFromNumberInBounds() {
        int num = 2;

        assertEquals(Level.MEDIUM, Level.fromNumber(num));
    }

    @Test
    void testFromNumberOutOfBounds() {
        int num = 0;

        assertThrows(NonLevelNumberException.class, () -> Level.fromNumber(num));
    }
}
