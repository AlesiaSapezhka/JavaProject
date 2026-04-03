import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MethodsForStrings {

    // 2. Подсчёт количества гласных в строке
    public int countVowels(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        return (int) input.toLowerCase().chars()
                .filter(c -> "aeiou".indexOf(c) != -1)
                .count();
    }

    //3. Разворот строки
    public String reverse(String input) {
        if (input == null) return null;
        return new StringBuilder(input).reverse().toString();
    }

    // 6. Проверка валидности email
    public boolean isValidEmail(String email) {
        return email != null && email.matches("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$");
    }

    //9. Подсчёт количества слов в строке
    public int countWords(String sentence) {
        return sentence.trim().isEmpty() ? 0 : sentence.split("\\s+").length;
    }

    //10. Проверка валидности номера телефона
    public boolean isValidPhoneNumber(String phone) {
        return phone.matches("\\+\\d{1,3} \\d{10}");
    }

    // 12. Сортировка списка строк по длине
    public List<String> sortByLength(List<String> words) {
        return words.stream()
            .sorted(Comparator.comparingInt(String::length))
            .collect(Collectors.toList());
    }

    //13. Проверка, является ли строка анаграммой другой
    public boolean isAnagram(String str1, String str2) {
        if (str1 == null || str2 == null) return false;
        char[] arr1 = str1.toLowerCase().replaceAll("\\s", "").toCharArray();
        char[] arr2 = str2.toLowerCase().replaceAll("\\s", "").toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}
