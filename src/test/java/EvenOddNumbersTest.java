import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EvenOddNumbersTest {
    // 1. Проверка чётности числа
    //Нечетные положительные и отрицательные числа
    @ParameterizedTest
    @ValueSource(ints = {1, -3, 5, -7, 9})
    public void testOddNumbers(int initialNumber) {
        EvenOddNumber evenOddNumber = new EvenOddNumber();

        boolean result = evenOddNumber.isEven(initialNumber);

        assertFalse(result, "Parity of the number was calculated incorrectly");
    }

    //Чётные положительные и отрицательные, плюс ноль
    @ParameterizedTest
    @ValueSource(ints = {2, -4, 0, -8, 234})
    public void testEvenNumbers(int initialNumber) {
        EvenOddNumber evenOddNumber = new EvenOddNumber();
        boolean result = evenOddNumber.isEven(initialNumber);

        assertTrue(result, "Parity of the number was calculated incorrectly");
    }
}