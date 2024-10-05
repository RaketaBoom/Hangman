package backend.academy.hangman.categories;

import backend.academy.hangman.Level;
import backend.academy.hangman.TypeCategory;
import backend.academy.hangman.Word;
import backend.academy.hangman.categories.impl.Animal;
import backend.academy.hangman.categories.impl.Color;
import backend.academy.hangman.categories.impl.Country;
import backend.academy.hangman.categories.impl.Fruit;
import backend.academy.hangman.categories.impl.Sport;
import java.util.Map;
import java.util.Random;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

@ExtendWith(MockitoExtension.class)
class CategoryTest {
    int numberOfTestWord = 0;
    @Mock
    Random mockRandom;

    @Test
    void testGetRandomWordForAnimals() {
        //Arrange
        Category[] categoriesForEachLevel = createCategoriesForEachLevel(TypeCategory.ANIMAL, mockRandom);
        int[] sizeMapOfWords = getSizeMapOfWordsForAnimal();
        configureMockRandom(sizeMapOfWords);

        String[] expectedWords = getExpectedWords(
            Animal.easyWordsAndHints,
            Animal.mediumWordsAndHints,
            Animal.hardWordsAndHints
        );

        //Act
        String[] actualWords = {
            categoriesForEachLevel[0].getRandomWord().modelWord(),
            categoriesForEachLevel[1].getRandomWord().modelWord(),
            categoriesForEachLevel[2].getRandomWord().modelWord(),
        };

        //Assert
        assertArrayEquals(expectedWords, actualWords);

    }

    @Test
    void testGetRandomWordForColor() {
        //Arrange
        Category[] categoriesForEachLevel = createCategoriesForEachLevel(TypeCategory.COLOR, mockRandom);
        int[] sizeMapOfWords = getSizeMapOfWordsForColor();
        configureMockRandom(sizeMapOfWords);
        String[] expectedWords = getExpectedWords(
            Color.easyWordsAndHints,
            Color.mediumWordsAndHints,
            Color.hardWordsAndHints
        );

        //Act
        String[] actualWords = {
            categoriesForEachLevel[0].getRandomWord().modelWord(),
            categoriesForEachLevel[1].getRandomWord().modelWord(),
            categoriesForEachLevel[2].getRandomWord().modelWord(),
        };

        //Assert
        assertArrayEquals(expectedWords, actualWords);

    }

    @Test
    void testGetRandomWordForCountry() {
        //Arrange
        Category[] categoriesForEachLevel = createCategoriesForEachLevel(TypeCategory.COUNTRY, mockRandom);
        int[] sizeMapOfWords = getSizeMapOfWordsForCountry();
        configureMockRandom(sizeMapOfWords);
        String[] expectedWords = getExpectedWords(
            Country.easyWordsAndHints,
            Country.mediumWordsAndHints,
            Country.hardWordsAndHints
        );

        //Act
        String[] actualWords = {
            categoriesForEachLevel[0].getRandomWord().modelWord(),
            categoriesForEachLevel[1].getRandomWord().modelWord(),
            categoriesForEachLevel[2].getRandomWord().modelWord(),
        };

        //Assert
        assertArrayEquals(expectedWords, actualWords);
    }

    @Test
    void testGetRandomWordForFruit() {
        //Arrange
        Category[] categoriesForEachLevel = createCategoriesForEachLevel(TypeCategory.FRUIT, mockRandom);
        int[] sizeMapOfWords = getSizeMapOfWordsForFruit();
        configureMockRandom(sizeMapOfWords);
        String[] expectedWords = getExpectedWords(
            Fruit.easyWordsAndHints,
            Fruit.mediumWordsAndHints,
            Fruit.hardWordsAndHints
        );

        //Act
        String[] actualWords = {
            categoriesForEachLevel[0].getRandomWord().modelWord(),
            categoriesForEachLevel[1].getRandomWord().modelWord(),
            categoriesForEachLevel[2].getRandomWord().modelWord(),
        };

        //Assert
        assertArrayEquals(expectedWords, actualWords);
    }

    @Test
    void testGetRandomWordForSport() {
        //Arrange
        Category[] categoriesForEachLevel = createCategoriesForEachLevel(TypeCategory.SPORT, mockRandom);
        int[] sizeMapOfWords = getSizeMapOfWordsForSport();
        configureMockRandom(sizeMapOfWords);
        String[] expectedWords = getExpectedWords(
            Sport.easyWordsAndHints,
            Sport.mediumWordsAndHints,
            Sport.hardWordsAndHints
        );

        //Act
        String[] actualWords = {
            categoriesForEachLevel[0].getRandomWord().modelWord(),
            categoriesForEachLevel[1].getRandomWord().modelWord(),
            categoriesForEachLevel[2].getRandomWord().modelWord(),
        };

        //Assert
        assertArrayEquals(expectedWords, actualWords);
    }

    @ParameterizedTest
    @EnumSource(TypeCategory.class)
    void testInitializeCategory(TypeCategory typeCategory) {
        //Arrange
        Level level = Level.HARD;
        Category expectedCategory = switch (typeCategory) {
            case ANIMAL -> new Animal(level, mockRandom);
            case COLOR -> new Color(level, mockRandom);
            case COUNTRY -> new Country(level, mockRandom);
            case FRUIT -> new Fruit(level, mockRandom);
            case SPORT -> new Sport(level, mockRandom);
        };

        //Act
        Category actualCategory = Category.initializeCategory(typeCategory, level, mockRandom);

        //Assert
        assertSame(expectedCategory.getClass(), actualCategory.getClass());
    }

    private int[] getSizeMapOfWordsForSport() {
        return new int[] {
            Sport.easyWordsAndHints.size(),
            Sport.mediumWordsAndHints.size(),
            Sport.hardWordsAndHints.size()
        };
    }

    private int[] getSizeMapOfWordsForFruit() {
        return new int[] {
            Fruit.easyWordsAndHints.size(),
            Fruit.mediumWordsAndHints.size(),
            Fruit.hardWordsAndHints.size()
        };
    }

    private int[] getSizeMapOfWordsForCountry() {
        return new int[] {
            Country.easyWordsAndHints.size(),
            Country.mediumWordsAndHints.size(),
            Country.hardWordsAndHints.size()
        };
    }

    private int[] getSizeMapOfWordsForColor() {
        return new int[] {
            Color.easyWordsAndHints.size(),
            Color.mediumWordsAndHints.size(),
            Color.hardWordsAndHints.size()
        };
    }

    private int[] getSizeMapOfWordsForAnimal() {
        return new int[] {
            Animal.easyWordsAndHints.size(),
            Animal.mediumWordsAndHints.size(),
            Animal.hardWordsAndHints.size()
        };
    }

    private Category[] createCategoriesForEachLevel(TypeCategory typeCategory, Random random) {
        return new Category[] {
            Category.initializeCategory(typeCategory, Level.EASY, random),
            Category.initializeCategory(typeCategory, Level.MEDIUM, random),
            Category.initializeCategory(typeCategory, Level.HARD, random)
        };
    }

    private void configureMockRandom(int[] sizes) {
        Mockito.when(mockRandom.nextInt(sizes[0])).thenReturn(numberOfTestWord);
        Mockito.when(mockRandom.nextInt(sizes[1])).thenReturn(numberOfTestWord);
        Mockito.when(mockRandom.nextInt(sizes[2])).thenReturn(numberOfTestWord);
    }

    private String[] getExpectedWords(
        Map<String, String> easyWordsAndHints,
        Map<String, String> mediumWordsAndHints,
        Map<String, String> hardWordsAndHints
    ) {
        String stringKeyEasy = (String) easyWordsAndHints.keySet().toArray()[numberOfTestWord];
        String stringKeyMedium = (String) mediumWordsAndHints.keySet().toArray()[numberOfTestWord];
        String stringKeyHard = (String) hardWordsAndHints.keySet().toArray()[numberOfTestWord];

        return new String[] {
            new Word(stringKeyEasy, easyWordsAndHints.get(stringKeyEasy)).modelWord(),
            new Word(stringKeyMedium, mediumWordsAndHints.get(stringKeyMedium)).modelWord(),
            new Word(stringKeyHard, hardWordsAndHints.get(stringKeyHard)).modelWord()
        };
    }

}
