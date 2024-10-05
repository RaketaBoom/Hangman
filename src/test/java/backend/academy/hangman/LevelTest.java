package backend.academy.hangman;

import backend.academy.hangman.exceptions.NonLevelNumberException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LevelTest {

    @Test
    void testValueOfInBounds() {
        //Arrange
        int num = 2;

        //Act
        Level actualLevel = Level.valueOf(num);

        //Assert
        assertEquals(Level.MEDIUM, actualLevel);
    }

    @Test
    void testValueOfOutOfBounds() {
        //Arrange
        int num = 0;

        //Act && Assert
        assertThrows(NonLevelNumberException.class, () -> Level.valueOf(num));
    }
}
