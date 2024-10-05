package backend.academy.hangman;

import backend.academy.hangman.exceptions.NonCategoryNumberException;
import backend.academy.hangman.exceptions.NonLevelNumberException;
import backend.academy.hangman.exceptions.NonRussianLetterException;
import java.util.Arrays;
import java.util.Scanner;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
class InputHandlerTest {
    InputHandler inputHandler;
    Level[] levels = Level.values();
    TypeCategory[] typeCategories = TypeCategory.values();
    @Mock
    Scanner mockScanner;

    @ParameterizedTest
    @ValueSource(strings = {
        "4",
        "9",
        "k",
        "-",
        "12"
    })
    void testGetLevelForException(String line) {
        //Arrange
        Mockito.when(mockScanner.nextLine()).thenReturn(line);
        inputHandler = new InputHandler(mockScanner);

        //Act && Assert
        assertThrows(NonLevelNumberException.class, () -> inputHandler.getLevel());
    }

    @Test
    void testGetLevelForLevelNumber() {
        //Arrange
        Mockito.when(mockScanner.nextLine()).thenReturn("2");
        inputHandler = new InputHandler(mockScanner);

        //Act
        Level actualLevel = inputHandler.getLevel();

        //Assert
        assertEquals(Level.MEDIUM, actualLevel);
    }

    @Test
    void testGetLevelForRandomLevel() {
        //Arrange
        Mockito.when(mockScanner.nextLine()).thenReturn("");
        inputHandler = new InputHandler(mockScanner);

        //Act
        Level actualLevel = inputHandler.getLevel();

        //Assert
        assertTrue(Arrays.asList(levels).contains(actualLevel));
    }

    @ParameterizedTest
    @ValueSource(strings = {
        "6",
        "23",
        " ",
        "ы"
    })
    void testGetTypeCategoryForException(String line) {
        //Arrange
        Mockito.when(mockScanner.nextLine()).thenReturn(line);
        inputHandler = new InputHandler(mockScanner);

        //Act && Assert
        assertThrows(NonCategoryNumberException.class, () -> inputHandler.getTypeCategory());
    }

    @Test
    void testGetTypeCategoryForCategoryNumber() {
        //Arrange
        Mockito.when(mockScanner.nextLine()).thenReturn("5");
        inputHandler = new InputHandler(mockScanner);

        //Act
        TypeCategory actualType = inputHandler.getTypeCategory();

        //Assert
        assertEquals(TypeCategory.SPORT, actualType);
    }

    @Test
    void testGetTypeCategoryForRandomCategory() {
        //Arrange
        Mockito.when(mockScanner.nextLine()).thenReturn("");
        inputHandler = new InputHandler(mockScanner);

        //Act
        TypeCategory actualType = inputHandler.getTypeCategory();

        //Assert
        assertTrue(Arrays.asList(typeCategories).contains(actualType));
    }

    @ParameterizedTest
    @ValueSource(strings = {
        "4",
        "9",
        "k",
        "-",
        "",
        "12"
    })
    void testGetLetterForNonRussianLetter(String line) {
        //Arrange
        Mockito.when(mockScanner.nextLine()).thenReturn(line);
        inputHandler = new InputHandler(mockScanner);

        //Act && Assert
        assertThrows(NonRussianLetterException.class, () -> inputHandler.getLetter());
    }

    @Test
    void testGetLetterForRussianLetter() {
        //Arrange
        Mockito.when(mockScanner.nextLine()).thenReturn("ф");
        inputHandler = new InputHandler(mockScanner);

        //Act
        char actualLetter = inputHandler.getLetter();

        //Assert
        assertEquals('ф', actualLetter);
    }
}
