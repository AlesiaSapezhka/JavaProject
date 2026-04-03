package practice6.hashSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import practice6.hashSet.Task1;

public class Main {
    public static void main(String[] args) {
    // Задание 1
    Task1 task1 = new Task1();
    task1.addNumber(3);
    task1.addNumber(6);
    task1.addNumber(8);
    task1.addNumber(7);
    task1.addNumber(7); // Не добавиться, ибо Set не допускает дубликатов
    System.out.println(task1.numbers);
    task1.printNumbers();

    // Задание 2
    Task2 task2 = new Task2();
    System.out.println(task2.isContainNumber(-4));

    // Задание 3
    Task3 task3 = new Task3();
    String [] list = {"hello", "hi", "hello", "he123"};
    ArrayList<String> listOfStrings = new ArrayList<>(Arrays.asList(list));
    System.out.println(task3.removeDuplicates(listOfStrings));

    // Задание 4
    Task4 task4 = new Task4();
    System.out.println(task4.ifListExistsGivenName("Alice1"));
    }
}
