package backend.academy.hangman;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Word {
    private char[] maskedWord;
    private char[] targetWord;

    public Word(String targetWord){
        this.targetWord = targetWord.toCharArray();
        maskedWord = generateMaskedWord(targetWord);
    }
    private char[] generateMaskedWord(String word) {
        char[] masked = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            masked[i] = '_';
        }
        return masked;
    }

    public boolean tryGuess(char letter){
        boolean isContainedLetter = false;
        for (int i = 0; i < targetWord.length; i++) {
            if(letter == targetWord[i]){
                isContainedLetter = true;
                maskedWord[i] = letter;
            }
        }
        return isContainedLetter;
    }

    public boolean isWin(){
        for (int i = 0; i < maskedWord.length; i++) {
            if(maskedWord[i] == '_'){
                return false;
            }
        }
        return true;
    }
}
