package backend.academy.hangman.validators;

public class InputValidator {
    private InputValidator() {
    }

    public static boolean isNumberCategory(String t) {
        if (t.length() != 1) {
            return false;
        }
        return t.charAt(0) >= '1' && t.charAt(0) <= '5';
    }

    public static boolean isRussianLetter(String t) {
        if (t.length() != 1) {
            return false;
        }
        return (t.charAt(0) >= 'а' && t.charAt(0) <= 'я') || (t.charAt(0) >= 'А' && t.charAt(0) <= 'Я')
            || t.charAt(0) == 'ё' || t.charAt(0) == 'Ё';
    }

    public static boolean isNumberLevel(String t) {
        if (t.length() != 1) {
            return false;
        }
        return t.charAt(0) >= '1' && t.charAt(0) <= '3';
    }
}
