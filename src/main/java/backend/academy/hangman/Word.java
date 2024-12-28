package backend.academy.hangman;

import lombok.Getter;

@Getter
public class Word {
    private final char[] maskedWord; // массивы char, чтобы удобно сравнивать
    private final char[] targetWord;

    private final String modelWord;
    private final String hint;

    public Word(String word, String hint) {
        this.targetWord = word.toLowerCase().toCharArray();
        this.maskedWord = generateMaskedWord(word);
        this.modelWord = word;
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
        for (char c : maskedWord) {
            if (c == '_') {
                return false;
            }
        }
        return true;
    }
}
