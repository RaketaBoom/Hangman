package backend.academy.hangman.validators;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.lang.foreign.ValueLayout;
import static org.junit.jupiter.api.Assertions.*;

class InputValidatorTest {

    @ParameterizedTest
    @CsvSource({
        "''", // Пустая строка
        "' '", // Строка с пробелом
        "k",
        "лу"
    })
    void testIsNumberCategoryForNonNumber(String input) {
        assertFalse(InputValidator.isNumberCategory(input));
    }

    @ParameterizedTest
    @CsvSource({
        "23",
        "9",
        "0",
        "-2"
    })
    void testIsNumberCategoryForOutOfBoundsNumber(String input) {
        assertFalse(InputValidator.isNumberCategory(input));
    }

    @ParameterizedTest
    @CsvSource({
        "1",
        "2",
        "3",
        "4",
        "5"
    })
    void testIsNumberCategoryForInBoundsNumber(String input) {
        assertTrue(InputValidator.isNumberCategory(input));
    }

    @ParameterizedTest
    @CsvSource({
        "23",
        "3",
        "' '",
        "''",
        "павук"
    })
    void testIsRussianLetterForNonLetter(String input) {
        assertFalse(InputValidator.isRussianLetter(input));
    }

    @ParameterizedTest
    @CsvSource({
        "Q",
        "q",
        "r",
        "erw"
    })
    void testIsRussianLetterForEnglishLetter(String input) {
        assertFalse(InputValidator.isRussianLetter(input));
    }

    @ParameterizedTest
    @CsvSource({
        "Д",
        "у",
        "ё",
        "з"
    })
    void testIsRussianLetterForRussianLetter(String input) {
        assertTrue(InputValidator.isRussianLetter(input));
    }

    @ParameterizedTest
    @CsvSource({
        "''",
        "' '",
        "k",
        "лу"
    })
    void testIsNumberLevelForNonNumber(String input) {
        assertFalse(InputValidator.isNumberLevel(input));
    }

    @ParameterizedTest
    @CsvSource({
        "0",
        "-1",
        "5",
        "12"
    })
    void testIsNumberLevelForOutOfBoundsNumber(String input) {
        assertFalse(InputValidator.isNumberLevel(input));
    }

    @ParameterizedTest
    @CsvSource({
        "1",
        "2",
        "3"
    })
    void testIsNumberLevelForInBoundsNumber(String input) {
        assertTrue(InputValidator.isNumberLevel(input));
    }
}
