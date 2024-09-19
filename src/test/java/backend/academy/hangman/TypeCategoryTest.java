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
        assertThrows(NonCategoryNumberException.class, () -> TypeCategory.valueOf(num));
    }

    @Test
    void testValueOfForInBoundsNumber1() {
        int num = 1;

        TypeCategory actualType = TypeCategory.valueOf(num);

        TypeCategory expectedType = TypeCategory.ANIMAL;
        assertEquals(expectedType, actualType);
    }

    @Test
    void testValueOfForInBoundsNumber2() {
        int num = 3;

        TypeCategory actualType = TypeCategory.valueOf(num);

        TypeCategory expectedType = TypeCategory.COUNTRY;
        assertEquals(expectedType, actualType);
    }

    @Test
    void testValueOfForInBoundsNumber3() {
        int num = 5;

        TypeCategory actualType = TypeCategory.valueOf(num);

        TypeCategory expectedType = TypeCategory.SPORT;
        assertEquals(expectedType, actualType);
    }
}
