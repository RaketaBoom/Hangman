package backend.academy.hangman.exceptions;

public class NonRussianLetterException extends RuntimeException {
    private static final String MESSAGE = "Символ не является буквой русского алфавита";

    public NonRussianLetterException() {
        super(MESSAGE);
    }
}
