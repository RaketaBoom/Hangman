package backend.academy.hangman;

import lombok.Getter;

@Getter
public class Word {
    private char[] maskedWord;
    private char[] targetWord;
    private String modelWord;
    private String hint;

    public Word(String word, String hint) {
        targetWord = word.toLowerCase().toCharArray();
        maskedWord = generateMaskedWord(word);
        modelWord = word;
        this.hint = hint;
    }

    private char[] generateMaskedWord(String word) {
        char[] masked = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            masked[i] = '_';
        }
        return masked;
    }

    public boolean tryGuess(char letter) {
        boolean isContainedLetter = false;
        for (int i = 0; i < targetWord.length; i++) {
            if (letter == targetWord[i]) {
                isContainedLetter = true;
                maskedWord[i] = modelWord.charAt(i);
            }
        }
        return isContainedLetter;
    }

    public boolean isWin() {
        for (int i = 0; i < maskedWord.length; i++) {
            if (maskedWord[i] == '_') {
                return false;
            }
        }
        return true;
    }
}
