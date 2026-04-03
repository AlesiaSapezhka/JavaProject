package practice7.generics;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    // Задача: Реализуйте метод printList(List<T>),
    List<String> list = Arrays.asList("hi", "how", "are", "you", "friend");
    printList(list);
    List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
    printList(list1);

    // Создайте класс Pair, который может хранить два объекта разных типов.
    // Класс должен позволять получать и устанавливать каждый из этих объектов.
    Pair <String,Number> person = new Pair<>("Petr", 10);
    person.setFirst("Misha");
    person.setSecond(20);
    System.out.println(person.getFirst());
    System.out.println(person.getSecond());

    //  Создайте класс Storage<T>, который хранит элемент и возвращает его.
    Storage <String> word = new Storage<>("word");
    System.out.println(word.getItem());
    Storage <Integer> number = new Storage<>(5);
    System.out.println(number.getItem());

    // Задача: Напишите обобщённый метод, который принимает List<T extends Number> и вычисляет сумму элементов.
    NumberBox<Integer> numberBox = new NumberBox<>(Arrays.asList(6,7,8,8));
    System.out.println(numberBox.getSum());
    }

    public static <T> void printList(List <T> list) {
        list.forEach(element -> System.out.println(element));
    }

}
