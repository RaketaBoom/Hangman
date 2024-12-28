package backend.academy.hangman;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class WordTest {
    private Word word;

    @BeforeEach
    void generateWord() {
        word = new Word("Такси", "Зеленоглазое");
    }

    boolean[] makeAttempts(char c1, char c2, char c3, char c4, char c5) {

        return new boolean[] {
            word.tryGuess(c1),
            word.tryGuess(c2),
            word.tryGuess(c3),
            word.tryGuess(c4),
            word.tryGuess(c5)
        };
    }

    @Test
    void testConstructor() {
        //Arrange
        char[] expectedMaskedWord = "_____".toCharArray();
        char[] expectedTargetWord = "такси".toCharArray();

        //Act
        char[] actualMaskedWord = word.maskedWord();
        char[] actualTargetWord = word.targetWord();

        //Assert
        assertArrayEquals(expectedMaskedWord, actualMaskedWord);
        assertArrayEquals(expectedTargetWord, actualTargetWord);

    }

    @Test
    void testTryGuessFailedAttempts() {
        //Arrange
        boolean[] expectedResults = {
            false,
            false,
            false,
            false,
            false
        };
        char[] expectedMaskedWord = "_____".toCharArray();

        //Act
        boolean[] actualResults = makeAttempts('й', 'ш', 'х', 'ь', 'ч');
        char[] actualMaskedWord = word.maskedWord();

        //Assert
        assertArrayEquals(expectedMaskedWord, actualMaskedWord);
        assertArrayEquals(expectedResults, actualResults);
    }

    @Test
    void testTryGuessSuccessfulAttempts() {
        //Arrange
        boolean[] expectedResults = {
            true,
            true,
            true,
            true,
            true
        };
        char[] expectedMaskedWord = "Такси".toCharArray();

        //Act
        boolean[] actualResults = makeAttempts('а', 'т', 'к', 'и', 'с');
        char[] actualMaskedWord = word.maskedWord();

        //Assert
        assertArrayEquals(expectedMaskedWord, actualMaskedWord);
        assertArrayEquals(expectedResults, actualResults);
    }

    @Test
    void testTryGuessSuccessfulAndFailedAttempts() {
        //Arrange
        boolean[] expectedResults = {
            true,
            false,
            true,
            false,
            true
        };
        char[] expectedMaskedWord = "_акс_".toCharArray();

        //Act
        boolean[] actualResults = makeAttempts('а', 'й', 'к', 'з', 'с');
        char[] actualMaskedWord = word.maskedWord();

        //Assert
        assertArrayEquals(expectedMaskedWord, actualMaskedWord);
        assertArrayEquals(expectedResults, actualResults);
    }

    @Test
    void testIsWinForWin() {
        //Act
        makeAttempts('а', 'т', 'к', 'и', 'с');

        //Assert
        assertTrue(word.isWin());
    }

    @Test
    void testIsWinForLose1() {
        //Act
        makeAttempts('й', 'ш', 'х', 'ь', 'ч');

        //Assert
        assertFalse(word.isWin());
    }

    @Test
    void testIsWinForLose2() {
        //Act
        makeAttempts('а', 'й', 'к', 'з', 'с');

        //Assert
        assertFalse(word.isWin());
    }
}
