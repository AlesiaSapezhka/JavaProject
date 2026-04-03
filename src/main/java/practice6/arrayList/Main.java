package practice6.arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Task1
        Task1 numbers = new Task1();
        numbers.showArray();
        numbers.addNumber(123);
        numbers.showArray();

        // Task2 first variant
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6, 8, 9, 4, 3));
        Task2 numbersList = new Task2();
        System.out.println(numbersList.returnEvenNumbers(list));

        // Task2 second variant
        Task2 arrayList = new Task2();
        arrayList.addNumber(7);
        arrayList.addNumber(17);
        arrayList.addNumber(66);
        arrayList.printEvenNumbers();

        // Task3
        ArrayList<String> words = new ArrayList<>(Arrays.asList("hi", "how", "are", "you", "friend"));
        Task3 stringsArray = new Task3();
        System.out.println(stringsArray.maxString(words));

        // Task4
        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(6, 8, 9, 4, 3));
        Task4 integersList = new Task4();
        System.out.println(integersList.sumOfNumber(integers));

        // Task5
        ArrayList<Integer> integerList = new ArrayList<>(Arrays.asList(6, 8, 9, 1444, 3));
        Task5 integersArray = new Task5();
        System.out.println(integersArray.maxNumber(integerList));

    }
}
