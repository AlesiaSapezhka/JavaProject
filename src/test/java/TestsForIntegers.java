import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class TestsForIntegers extends IntegerTests {
    // 4. Поиск максимального числа в массиве
    //Напишите тесты для метода, который находит максимальное число в массиве:

    //Тесты должны проверять:
    //Обычный массив ([3, 5, 7, 2])
    //Один элемент в массиве
    //Отрицательные числа
    // Пустой массив (должно выбрасываться исключение)
    // null
    public static Stream<Arguments> validArrays() {
        return Stream.of(
                Arguments.of(new int[]{3, 5, 7, 8, 2}, 8),
                Arguments.of(new int[]{3}, 3),
                Arguments.of(new int[]{-3, -5, -7, -8, -3}, -3));
    }

    @ParameterizedTest
    @MethodSource("validArrays")
    public void testForSearchMaxNumberInArray(int[] validArray, int expectedMaxNumber) {
        int actualMaxNumber = methodsForIntegers.findMax(validArray);
        assertEquals(expectedMaxNumber, actualMaxNumber, "Max number from array counted incorrectly");

    }

    @Test
    public void maxNumberCanNotBeFoundInBlankArray() {
        assertThrows(NoSuchElementException.class, () -> {
            methodsForIntegers.findMax(new int[]{});
                },
            "Find Max number in blank array leads to NoSuchElementException");

    }

    @Test
    public void maxNumberCanNotBeFoundInNullArray() {
        assertThrows(NoSuchElementException.class, () -> {
                    methodsForIntegers.findMax(null);
                },
                "Find Max number in null array leads to NoSuchElementException");

    }


    //5. Проверка, является ли год високосным
    //Напишите тесты для метода, который определяет, является ли год високосным:
    //Тесты должны проверять:
    //Обычные годы
    //Високосные (2020, 2000, 1600)
    //Года, которые делятся на 100, но не на 400 (1900, 2100)

    @ParameterizedTest
    @DisplayName("Проверка, является ли год високосным, валидные года")
    @ValueSource(ints = {2020, 2000, 1600})
    public void testForCountValidLeapYears (int validYear){
        boolean actualYear = methodsForIntegers.isLeapYear(validYear);
        assertTrue(actualYear, "Leap year count was not calculated correctly");
    }
    @ParameterizedTest
    @DisplayName("Проверка, является ли год високосным, невалидные года")
    @ValueSource(ints = {1900, 2100, 2025})
    public void testForCountNotValidLeapYears (int inValidYear){
        boolean actualYear = methodsForIntegers.isLeapYear(inValidYear);
        assertFalse(actualYear, "Leap year count was not calculated correctly");
    }

    // 7. Факториал числа
    //Напишите тесты для метода, который вычисляет факториал числа:
    //Тесты должны проверять:
    //0! = 1
    //Маленькие числа (1!, 5!, 7!)
    //Отрицательные числа (должно выбрасываться исключение)

    public static Stream<Arguments> validNumbers() {
        return Stream.of(
                Arguments.of(0, 1),
                Arguments.of(1, 1),
                Arguments.of(5, 120),
                Arguments.of(7, 5040));
    }
    @ParameterizedTest
    @MethodSource("validNumbers")
    public void testForCountFactorialForValidNumbers(int validNumber, int expectedFactorial) {
        int actualFactorial = methodsForIntegers.factorial(validNumber);
        assertEquals(expectedFactorial, actualFactorial, "Factorial was not calculated correctly");
    }

    @Test
    public void testForCountFactorialForNegativeNumbers() {
        assertThrows(IllegalArgumentException.class, () -> {
            methodsForIntegers.factorial(-1);
        }, "Count factorial for negative number should create IllegalArgumentException");
    }

    //8. Поиск второго максимального числа в массиве
    //Напишите тесты для метода, который находит второе по величине число:
    //Тесты должны проверять:
    //Обычные массивы
    //Массив с одинаковыми числами
    //Один элемент в массиве (должно выбрасываться исключение)

    public static Stream<Arguments> validArray() {
        return Stream.of(
                Arguments.of(new int[]{3, 5, 7, 8, 2}, 7),
                // BUG Method doesn't work for array with duplicates
                Arguments.of(new int[]{3,3,3,3,2,4,4,4,5,5}, 5)
        );
    }
    // BUG Method doesn't work for array with duplicates
    @ParameterizedTest
    @MethodSource("validArray")
    public void testToFindSecondMaxNumberInValidArray(int [] validArray, int expectedSecondMaxNumber) {
        int actualSecondMaxNumber = methodsForIntegers.findSecondMax(validArray);
        assertEquals(expectedSecondMaxNumber, actualSecondMaxNumber, "Second Max number was not calculated correctly");
    }

    @Test
    public void testToFindSecondMaxNumberInArrayWithOneElement() {
        assertThrows(IllegalArgumentException.class, () -> {
            methodsForIntegers.findSecondMax(new int[]{3});
        },"Second Max number should create IllegalArgumentException if array consists from one element");
    }

    // 11. Фильтрация списка чисел (оставить только чётные)
    //Тесты:
    //Обычный список ([1, 2, 3, 4, 5, 6] → [2, 4, 6])
    //Список без чётных чисел
    //Пустой список
    public static Stream<Arguments> validArrayLists() {
        return Stream.of(
                Arguments.of(
                        new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6)),
                        new ArrayList<>(Arrays.asList(2, 4, 6))),
                Arguments.of(
                        new ArrayList<>(Arrays.asList(1,  3,  5)),
                        new ArrayList<>(Arrays.asList())
        ),
        Arguments.of(
                new ArrayList<>(Arrays.asList()),
                new ArrayList<>(Arrays.asList())
        ));
    }

    @ParameterizedTest
    @MethodSource("validArrayLists")
    public void testToCreateArrayOnlyWithEvenNumbers(ArrayList <Integer> validArrayList, ArrayList <Integer> evenArrayList) {
        List<Integer> actualArrayList = methodsForIntegers.filterEvenNumbers(validArrayList);
        assertEquals(evenArrayList, actualArrayList, "Filtering array only with even numbers was not performed correctly");
    }

    // 14. Нахождение среднего значения массива чисел
    //Тесты:
    //[1, 2, 3, 4, 5] → 3.0
    //[10] → 10.0
    //Пустой массив (должно выбрасываться исключение)
    public static Stream<Arguments> validArrayToCountAverage() {
        return Stream.of(
                Arguments.of(new int[]{3, 5, 7, 8, 2}, 5),
                // BUG Method doesn't work for array with duplicates
                Arguments.of(new int[]{5}, 5)
        );
    }
    @ParameterizedTest
    @MethodSource("validArrayToCountAverage")
    public void testAverageNumberCountFromValidArray (int [] validArray, int expectedAverageValue){
        double actualAverageNumber = methodsForIntegers.findAverage(validArray);
        assertEquals(expectedAverageValue, actualAverageNumber, "Average number from array numbers was not calculated correctly");
    }

    @Test
    public void testAverageNumberCountFromNullArray() {
        assertThrows(NullPointerException.class, () -> {
            methodsForIntegers.findAverage(null);
        }, "Find Average number in blank array leads to NullPointerException");
    }

    // 18. Нахождение наибольшего общего делителя (НОД)
    //Тесты:
    //24, 36 → 12
    //101, 103 → 1
    //0, 10 → 10
    public static Stream<Arguments> validArrayToCountGCD() {
        return Stream.of(
                Arguments.of(24, 36, 12),
                Arguments.of(101, 103, 1),
                Arguments.of(0, 10, 10)
        );
    }
    @ParameterizedTest
    @MethodSource("validArrayToCountGCD")
    public void testGCPValueForValidArray (int a, int b, int expectedGCDValue){
        double actualGCD = methodsForIntegers.gcd(a, b);
        assertEquals(expectedGCDValue, actualGCD, "GCD number was not calculated correctly");
    }

    // 20. Проверка, содержит ли массив дубликаты
    //
    //Тесты:
    //[1, 2, 3, 4, 5] → false
    //[1, 2, 2, 3] → true
    //Пустой массив → false

    public static Stream<Arguments> validArrayToCheckIfArrayContainsDuplicates() {
        return Stream.of(
                Arguments.of(new int[]{1,2,3,4,5}, false),
                Arguments.of(new int[]{1,2,2,3}, true),
                Arguments.of(new int[]{}, false)
        );
    }
    @ParameterizedTest
    @MethodSource("validArrayToCheckIfArrayContainsDuplicates")
    public void validArrayToCheckIfArrayContainsDuplicates (int [] validArray, boolean expectedValueOfContainingDuplicates){
        boolean actualValueOfContainingDuplicates = methodsForIntegers.hasDuplicates(validArray);
        assertEquals(expectedValueOfContainingDuplicates, actualValueOfContainingDuplicates, "Check of containing duplicates in array works incorrectly");
    }
}
