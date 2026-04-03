package practice6.treeSet;

import java.util.Arrays;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
    //    Задача 1:
    //    Создайте TreeSet из 5 чисел и выведите его. Обратите внимание на порядок.

    Integer [] numbers = {6,7,4,20,190};
    TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(numbers));
    System.out.println(treeSet);

    Task1 task1 = new Task1();
    task1.findLower(2);
    task1.findHigher(332);
    }
}
