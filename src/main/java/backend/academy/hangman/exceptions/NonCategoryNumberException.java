package backend.academy.hangman.exceptions;

public class NonCategoryNumberException extends RuntimeException {
    private static final String MESSAGE = "Число не соответствует категории";

    public NonCategoryNumberException() {
        super(MESSAGE);
    }
}
