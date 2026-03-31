package practice8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainForStreamAPIAgregate {
    public static void main(String[] args) {
        // 1. Поиск максимального элемента
        //Задача: Напишите программу, которая принимает список чисел и находит в нём самое большое число, используя Stream API.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Integer maxNumber = numbers.stream()
                .max(Comparator.naturalOrder())
                .orElseThrow();
        System.out.println(maxNumber);

        //2. Поиск минимального элемента
        //Задача: Напишите программу, которая принимает список чисел и находит в нем наименьшее число, используя Stream API.
        Integer minNumber = numbers.stream()
                .min(Comparator.naturalOrder())
                .orElseThrow();
        System.out.println(minNumber);

        //3. Сумма всех элементов списка
        //Задача: Напишите программу, которая принимает список чисел и вычисляет их сумму, используя Stream API.
        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println(sum);

        //4. Поиск первого элемента, начинающегося на "Б"
        //Задача: Напишите программу, которая принимает список строк и находит первую строку, начинающуюся на букву "Б", используя Stream API.

        List<String> words = Arrays.asList("Hello", "Anna", "Bob", "Daniel");

        try {
            String firstWordStartedWithB = words.stream()
                    .filter(word->word.startsWith("B"))
                    .findFirst()
                    .orElseThrow(() -> new RuntimeException ("Word not found"));

            System.out.println(firstWordStartedWithB);
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

        //5. Проверка наличия хотя бы одного элемента по условию
        //Задача: Напишите программу, которая проверяет, есть ли хотя бы один элемент в списке, который удовлетворяет заданному условию (например, является чётным числом), используя Stream API.
        Boolean isEven = numbers.stream()
                .anyMatch(num -> num%2==0);
        System.out.println(isEven);
    }
}
