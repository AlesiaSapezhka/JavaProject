package practice6.treeSet;

import java.util.Arrays;
import java.util.TreeSet;

public class Task1 {

//    Задача 1:
//    Создайте TreeSet из 5 чисел и выведите его. Обратите внимание на порядок.
    Integer [] numbers = {6,7,4,20,190};
    TreeSet <Integer> treeSet = new TreeSet<>(Arrays.asList(numbers));

//   Задача 2:
//    Напишите метод, который добавляет числа в TreeSet, но не позволяет добавить дубликаты.
public void addElement(Integer element) {
    if(!treeSet.contains(element)){
        treeSet.add(element);
    } else {
        System.out.println("Element already exists");
    }
}

//    Задача 3:
//    Найдите ближайшее большее и меньшее число к заданному в TreeSet.
    public void findHigher(Integer element) {
        Integer higher = treeSet.higher(element);

        if (higher != null) {
            System.out.println(higher);
        } else {
            System.out.println("There is no higher element");
        }
    };

    public void findLower (Integer element) {
        Integer lower = treeSet.lower(element);

        if (lower != null) {
            System.out.println(lower);
        } else {
            System.out.println("There is no lower element");
        }
    }
}
