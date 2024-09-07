package backend.academy.hangman.exceptions;

public class NonLevelNumberException extends RuntimeException{
    private static final String MESSAGE = "Число не соответствует сложности";
    public NonLevelNumberException(){
        super(MESSAGE);
    }
}
