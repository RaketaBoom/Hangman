package backend.academy.hangman;

import backend.academy.hangman.exceptions.NonCategoryNumberException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TypeCategoryTest {

    @ParameterizedTest
    @ValueSource(ints = {0, -3, 6, 8, 90})
    void testValueOfForOutOfBoundsNumber(int num) {
        //Act && Assert
        assertThrows(NonCategoryNumberException.class, () -> TypeCategory.valueOf(num));
    }

    @Test
    void testValueOfForInBoundsNumber1() {
        //Arrange
        int num = 1;

        //Act
        TypeCategory actualType = TypeCategory.valueOf(num);

        //Assert
        assertEquals(TypeCategory.ANIMAL, actualType);
    }

    @Test
    void testValueOfForInBoundsNumber2() {
        //Arrange
        int num = 3;

        //Act
        TypeCategory actualType = TypeCategory.valueOf(num);

        //Assert
        assertEquals(TypeCategory.COUNTRY, actualType);
    }

    @Test
    void testValueOfForInBoundsNumber3() {
        //Arrange
        int num = 5;

        //Act
        TypeCategory actualType = TypeCategory.valueOf(num);

        //Assert
        assertEquals(TypeCategory.SPORT, actualType);
    }
}
