package backend.academy.hangman.validators;

public class InputValidator {
    private InputValidator(){}
    public static boolean isNumberCategory(String t){
        if (t.length() != 1) return false;
        return t.charAt(0) >= '1' && t.charAt(0) <= '5';
    }
}
