package backend.academy.hangman.exceptions;

public class InvalidHangmanStateException extends RuntimeException{
    private static final String MESSAGE = "Невозможное состояние виселицы";
    public InvalidHangmanStateException(){
        super(MESSAGE);
    }
}
