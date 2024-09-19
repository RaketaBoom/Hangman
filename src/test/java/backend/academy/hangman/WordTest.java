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
        word = new Word("Такси");
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
        char[] actualMaskedWord = word.maskedWord();
        char[] actualTargetWord = word.targetWord();

        char[] expectedMaskedWord = "_____".toCharArray();
        char[] expectedTargetWord = "такси".toCharArray();

        assertArrayEquals(expectedMaskedWord, actualMaskedWord);
        assertArrayEquals(expectedTargetWord, actualTargetWord);

    }

    @Test
    void tryGuessFailedAttempts() { // Надо проверить, что буквы угадываются и не угадываются и слово открывается
        boolean[] actualResults = makeAttempts('й', 'ш', 'х', 'ь', 'ч');
        char[] actualMaskedWord = word.maskedWord();

        boolean[] expectedResults = {
            false,
            false,
            false,
            false,
            false
        };
        char[] expectedMaskedWord = "_____".toCharArray();
        assertArrayEquals(expectedMaskedWord, actualMaskedWord);
        assertArrayEquals(expectedResults, actualResults);
    }

    @Test
    void tryGuessSuccessfulAttempts() {
        boolean[] actualResults = makeAttempts('а', 'т', 'к', 'и', 'с');
        char[] actualMaskedWord = word.maskedWord();

        boolean[] expectedResults = {
            true,
            true,
            true,
            true,
            true
        };
        char[] expectedMaskedWord = "такси".toCharArray();
        assertArrayEquals(expectedMaskedWord, actualMaskedWord);
        assertArrayEquals(expectedResults, actualResults);
    }

    @Test
    void tryGuessSuccessfulAndFailedAttempts() {
        boolean[] actualResults = makeAttempts('а', 'й', 'к', 'з', 'с');
        char[] actualMaskedWord = word.maskedWord();

        boolean[] expectedResults = {
            true,
            false,
            true,
            false,
            true
        };
        char[] expectedMaskedWord = "_акс_".toCharArray();
        assertArrayEquals(expectedMaskedWord, actualMaskedWord);
        assertArrayEquals(expectedResults, actualResults);
    }

    @Test
    void testIsWinForWin() { // Надо проверить, что после неудачи нет выигрыша,
        // После угадывания, если слово не полностью отгадано нет выигрыша
        // Отгадать все слово и проверить на выигрыш
        makeAttempts('а', 'т', 'к', 'и', 'с');

        assertTrue(word.isWin());
    }

    @Test
    void testIsWinForLose1() {
        makeAttempts('й', 'ш', 'х', 'ь', 'ч');

        assertFalse(word.isWin());
    }

    @Test
    void testIsWinForLose2() {
        makeAttempts('а', 'й', 'к', 'з', 'с');

        assertFalse(word.isWin());
    }
}
