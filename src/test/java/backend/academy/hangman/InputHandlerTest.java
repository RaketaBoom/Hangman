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
    Scanner scanner;

    @ParameterizedTest
    @ValueSource(strings = {
        "4",
        "9",
        "k",
        "-",
        "12"
    })
    void getLevelForException(String line) {
        Mockito.when(scanner.nextLine()).thenReturn(line);
        inputHandler = new InputHandler(scanner);

        assertThrows(NonLevelNumberException.class, () -> inputHandler.getLevel());
    }

    @Test
    void getLevelForLevelNumber() {
        Mockito.when(scanner.nextLine()).thenReturn("2");
        inputHandler = new InputHandler(scanner);

        Level actualLevel = inputHandler.getLevel();

        Level expectedLevel = Level.MEDIUM;
        assertEquals(expectedLevel, actualLevel);
    }

    @Test
    void getLevelForRandomLevel() {
        Mockito.when(scanner.nextLine()).thenReturn("");
        inputHandler = new InputHandler(scanner);

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
    void getTypeCategoryForException(String line) {
        Mockito.when(scanner.nextLine()).thenReturn(line);
        inputHandler = new InputHandler(scanner);

        assertThrows(NonCategoryNumberException.class, () -> inputHandler.getTypeCategory());
    }

    @Test
    void getTypeCategoryForCategoryNumber() {
        Mockito.when(scanner.nextLine()).thenReturn("5");
        inputHandler = new InputHandler(scanner);

        TypeCategory actualType = inputHandler.getTypeCategory();

        TypeCategory expectedType = TypeCategory.SPORT;
        assertEquals(expectedType, actualType);
    }

    @Test
    void getTypeCategoryForRandomCategory() {
        Mockito.when(scanner.nextLine()).thenReturn("");
        inputHandler = new InputHandler(scanner);

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
    void getLetterForNonRussianLetter(String line) {
        Mockito.when(scanner.nextLine()).thenReturn(line);
        inputHandler = new InputHandler(scanner);

        assertThrows(NonRussianLetterException.class, () -> inputHandler.getLetter());
    }

    @Test
    void getLetterForRussianLetter() {
        Mockito.when(scanner.nextLine()).thenReturn("ф");
        inputHandler = new InputHandler(scanner);

        char actualLetter = inputHandler.getLetter();

        char expectedLetter = 'ф';
        assertEquals(expectedLetter, actualLetter);
    }
}
