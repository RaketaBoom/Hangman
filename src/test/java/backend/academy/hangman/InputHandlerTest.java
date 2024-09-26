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
        Mockito.when(mockScanner.nextLine()).thenReturn(line);
        inputHandler = new InputHandler(mockScanner);

        assertThrows(NonLevelNumberException.class, () -> inputHandler.getLevel());
    }

    @Test
    void testGetLevelForLevelNumber() {
        Mockito.when(mockScanner.nextLine()).thenReturn("2");
        inputHandler = new InputHandler(mockScanner);

        Level actualLevel = inputHandler.getLevel();

        Level expectedLevel = Level.MEDIUM;
        assertEquals(expectedLevel, actualLevel);
    }

    @Test
    void testGetLevelForRandomLevel() {
        Mockito.when(mockScanner.nextLine()).thenReturn("");
        inputHandler = new InputHandler(mockScanner);

        Level actualLevel = inputHandler.getLevel();

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
        Mockito.when(mockScanner.nextLine()).thenReturn(line);
        inputHandler = new InputHandler(mockScanner);

        assertThrows(NonCategoryNumberException.class, () -> inputHandler.getTypeCategory());
    }

    @Test
    void testGetTypeCategoryForCategoryNumber() {
        Mockito.when(mockScanner.nextLine()).thenReturn("5");
        inputHandler = new InputHandler(mockScanner);

        TypeCategory actualType = inputHandler.getTypeCategory();

        TypeCategory expectedType = TypeCategory.SPORT;
        assertEquals(expectedType, actualType);
    }

    @Test
    void testGetTypeCategoryForRandomCategory() {
        Mockito.when(mockScanner.nextLine()).thenReturn("");
        inputHandler = new InputHandler(mockScanner);

        TypeCategory actualType = inputHandler.getTypeCategory();

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
        Mockito.when(mockScanner.nextLine()).thenReturn(line);
        inputHandler = new InputHandler(mockScanner);

        assertThrows(NonRussianLetterException.class, () -> inputHandler.getLetter());
    }

    @Test
    void testGetLetterForRussianLetter() {
        Mockito.when(mockScanner.nextLine()).thenReturn("ф");
        inputHandler = new InputHandler(mockScanner);

        char actualLetter = inputHandler.getLetter();

        char expectedLetter = 'ф';
        assertEquals(expectedLetter, actualLetter);
    }
}
