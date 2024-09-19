package backend.academy.hangman;

import backend.academy.hangman.exceptions.NonLevelNumberException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LevelTest {

    @Test
    void testValueOfInBounds() {
        int num = 2;

        assertEquals(Level.MEDIUM, Level.valueOf(num));
    }

    @Test
    void testValueOfOutOfBounds() {
        int num = 0;

        assertThrows(NonLevelNumberException.class, () -> Level.valueOf(num));
    }
}
