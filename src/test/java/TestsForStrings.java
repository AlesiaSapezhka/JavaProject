import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class TestsForStrings extends StringTests{
    // 2. Подсчёт количества гласных в строке
    //Напишите тесты для метода, который считает количество гласных букв в строке:
    //Тесты должны проверять:
    //Разные строки ("hello", "java", "AEIOU", "")
    //null (должно выбрасываться исключение)
    //Строки без гласных
    public static Stream<Arguments> validStringToCountVowels() {
        return Stream.of(
                Arguments.of("hello", 2),
                Arguments.of("java", 2),
                Arguments.of("AIOUE", 5),
                Arguments.of("hll", 0)
                );
    }
    @ParameterizedTest
    @MethodSource("validStringToCountVowels")
    public void testToCountVowels(String word, int expectedCount) {
        int actualCount = methodsForStrings.countVowels(word);
        assertEquals(expectedCount, actualCount, "Wrong number of vowels for word: " + word);

    }
    @Test
    public void testToCountVowelsForNullValue() {
        assertThrows(IllegalArgumentException.class, () -> {
            methodsForStrings.countVowels(null);
        }, "If input is null IllegalArgumentException should be thrown");
    }

    //3. Разворот строки
    //Напишите тесты для метода, который переворачивает строку:
    //Тесты должны проверять:
    //Обычные строки
    //Пустую строку
    //null (должно возвращаться null)

    public static Stream<Arguments> validStringToReverse() {
        return Stream.of(
                Arguments.of("hello", "olleh"),
                Arguments.of("JAva", "avAJ"),
                Arguments.of("", ""),
                Arguments.of("!Hello!", "!olleH!")
        );
    }
    @ParameterizedTest
    @MethodSource("validStringToReverse")
    public void testToCountVowels(String word, String reversedWord) {
        String actualReversedWord = methodsForStrings.reverse(word);
        assertEquals(reversedWord, actualReversedWord, "Reversing was performed incorrectly for word: " + word);

    }
    // BUG method do not create Exception for NUll value
    @Test
    public void testReversingStringForNullValue() {
        assertThrows(IllegalArgumentException.class, () -> {
            methodsForStrings.reverse(null);
        }, "If input is null IllegalArgumentException should be thrown");
    }

    // 6. Проверка валидности email
    //Напишите тесты для метода, который проверяет, является ли строка валидным email:
    //Тесты должны проверять:
    //Корректные и некорректные email ("test@example.com", "bad@.com", "no-at-symbol")
    //null

    @ParameterizedTest
    @ValueSource(strings = {"test@example.com", "goodEmail@vk.com", "no-at-symbol@email.com"})
    public void testValidEmails(String words) {
       boolean actualResult = methodsForStrings.isValidEmail(words);
       assertTrue(actualResult);
    }

    @ParameterizedTest
    @ValueSource(strings = {"test@.com", "bad@.com", "no-at-symbol", "", "3456", })
    public void testInvalidEmails(String words) {
        boolean actualResult = methodsForStrings.isValidEmail(words);
        assertFalse(actualResult);
    }
    // BUG Method doesn't throw Exception
    @Test
    public void testValidEmailsForNullValue() {
        assertThrows(IllegalArgumentException.class, () -> {
            methodsForStrings.isValidEmail(null);
        }, "If input is null IllegalArgumentException should be thrown");
    }

    //9. Подсчёт количества слов в строке
    //Напишите тесты для метода, который считает количество слов в строке:
    //Тесты должны проверять:
    //Пустую строку
    //null
    //Строку с несколькими пробелами

    public static Stream<Arguments> sentencesToCountWords() {
        return Stream.of(
                Arguments.of("", 0),
                Arguments.of("JAva is language", 3)
        );
    }
    @ParameterizedTest
    @MethodSource("sentencesToCountWords")
    public void testToCountWordsInSentence(String sentence, int expectedCount) {
       int actualWordsCount = methodsForStrings.countWords(sentence);
        assertEquals(actualWordsCount, expectedCount, "Words counting in sentence was performed incorrectly for sentence: " + sentence);
    }
    // BUG Method doesn't throw Exception
    @Test
    public void testWordsCountForNullValue() {
        assertThrows(IllegalArgumentException.class, () -> {
            methodsForStrings.countWords(null);
        }, "If input is null IllegalArgumentException should be thrown");
    }

    //10. Проверка валидности номера телефона
    //Напишите тесты для метода, который проверяет валидность телефонного номера:
    //Тесты должны проверять:
    //Корректные номера ("+1 1234567890")
    //Некорректные номера ("12345", "invalid")

    @ParameterizedTest
    @ValueSource(strings = {"+1 1234567890", "+3 7567890809"})
    public void testValidNumber(String number) {
        boolean isNumberValid= methodsForStrings.isValidPhoneNumber(number);
        assertTrue(isNumberValid, "Valid number was counted as wrong");
    }

    @ParameterizedTest
    @ValueSource(strings = {"+12 1237890", "37567890809", "+ooooo"})
    public void testInValidNumber(String number) {
        boolean isNumberValid= methodsForStrings.isValidPhoneNumber(number);
        assertFalse(isNumberValid, "Invalid number was counted as correct");
    }

    // 12. Сортировка списка строк по длине
    //Тесты:
    //[ "Java", "C", "Python" ] → [ "C", "Java", "Python" ]
    //Одинаковые длины ([ "aa", "bb", "cc" ])
    //Пустой список
     public static Stream<Arguments> stringsArray() {
        return Stream.of(
                Arguments.of(
                        new ArrayList<>(Arrays.asList("Java", "C", "Python" )),
                        new ArrayList<>(Arrays.asList("C", "Java", "Python"))),
                Arguments.of(
                        new ArrayList<>(Arrays.asList("ff","aa", "bb", "cc")),
                        new ArrayList<>(Arrays.asList("ff","aa", "bb", "cc"))
                ),
                Arguments.of(
                        new ArrayList<>(Arrays.asList()),
                        new ArrayList<>(Arrays.asList())
                )
        );
    }

    @ParameterizedTest
    @MethodSource("stringsArray")
    public void testToCreateArrayOnlyWithEvenNumbers(ArrayList <String> initialArray, ArrayList <Integer> sortedArray) {
        List<String> actualSortedArray = methodsForStrings.sortByLength(initialArray);
        assertEquals(sortedArray, actualSortedArray, "Sorting strings array by length was not performed correctly");
    }



    //13. Проверка, является ли строка анаграммой другой
    //Тесты:
    //"listen", "silent" → true
    //"java", "python" → false
    //null → false
    public static Stream<Arguments> wordsForAnagrams() {
        return Stream.of(
                Arguments.of("listen", "Silent", true),
                Arguments.of("Java", "Python", false)
        );
    }

    @ParameterizedTest
    @MethodSource("wordsForAnagrams")
    public void testWordsForAnagrams(String word1, String word2, boolean expected) {
        boolean actualValue =  methodsForStrings.isAnagram(word1, word2);
        assertEquals(expected, actualValue, "Anagrams for words were not performed correctly");
    }

    @Test
    public void testWordsForAnagramsWithNulls() {
        boolean actualValue = methodsForStrings.isAnagram(null, null);
        assertFalse(actualValue, "Anagrams for null words were not performed correctly");
    }
}
