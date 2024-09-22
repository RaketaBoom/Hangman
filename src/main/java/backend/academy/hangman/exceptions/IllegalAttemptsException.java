package backend.academy.hangman.exceptions;

public class IllegalAttemptsException extends RuntimeException {
    private static final String MESSAGE = """
        Число попыток отрицательно.
        Присвойте MAX_ATTEMPTS положительное число и запустите игру заново
        """;

    public IllegalAttemptsException() {
        super(MESSAGE);
    }
}
