package practice8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainForStreamAPIGroup {
    public static void main(String[] args) {
        // 1. Группировка строк по первой букве
        //Задача: Напишите программу, которая принимает список строк и группирует их по первой букве, используя Stream API.

        List<String> words = Arrays.asList("Anna", "Bob", "Alice", "Tom", "John", "Tim");
        Map<Object, List<String>> groupedWords = words.stream()
                .collect(Collectors.groupingBy(symbol->symbol.substring(0, 1)));

        System.out.println(groupedWords);

        //2. Группировка чисел по чётности
        //Задача: Напишите программу, которая принимает список чисел и группирует их на чётные и нечётные, используя Stream API.

        List <Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Map<String, List<Integer>> groupedNumbers = numbers.stream()
                .collect(Collectors.groupingBy(num -> String.valueOf(num %2==0)));

        System.out.println("Is number even?" + groupedNumbers);

        //3. Поиск среднего значения чисел
        //Задача: Напишите программу, которая принимает список чисел и находит их среднее значение, используя Stream API.

        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        double average = sum / numbers.size();
        System.out.println("Average is " + average);

        double averageNum = numbers.stream()
                .collect(Collectors.averagingDouble(n->n));

        System.out.println("Average is " + averageNum);
    }
}
