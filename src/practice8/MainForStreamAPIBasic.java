package practice8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainForStreamAPIBasic {
    public static void main(String[] args) {
        // Задача1: Напишите программу, которая принимает список строк и удаляет из него все строки длиной 5 символов и менее, используя Stream API.
        List<String> stringList = Arrays.asList("hello", "world", "java", "function");
        List<String> sortedList = stringList.stream()
                .filter(string -> string.length()>5)
                .collect(Collectors.toList());

        System.out.println(sortedList);

        // Задача2: Напишите программу, которая принимает список чисел и отбирает только те, которые делятся на 5 без остатка, используя Stream API.
        List <Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List <Integer> sortedNumbers = numbers.stream()
                .filter(number -> number%5==0)
                .collect(Collectors.toList());
        System.out.println(sortedNumbers);

        // Задача3: Напишите программу, которая принимает список строк и заменяет каждую строку на её длину, используя Stream API.
        List<Integer> stringsLength = stringList.stream()
                .map((string) ->string.length())
                .collect(Collectors.toList());

        System.out.println(stringsLength);

        // Задача4: Напишите программу, которая принимает список чисел и преобразует его в новый список, где каждое число заменено на его квадрат, используя Stream API.
        List<Integer> squareNumbers = numbers.stream()
                .map((number) -> number*number)
                .collect(Collectors.toList());
        System.out.println(squareNumbers);

        // Задача5: Напишите программу, которая принимает список элементов и удаляет из него все дубликаты, используя Stream API.
        List <Object> elements = Arrays.asList("hh", 5, "hello", 5,6,7,8,8, "hh");
        List<Object> uniqueElements = elements.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(uniqueElements);
    }
}
