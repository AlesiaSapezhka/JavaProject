package practice6.arrayDeque;

import java.util.ArrayDeque;
import java.util.Arrays;

public class Tasks {
    // Задача 1:
    //Создайте ArrayDeque, добавьте 5 элементов и выведите их.

    Integer [] elements = {7,8,9,11,90};
    ArrayDeque<Integer> arrayDeque = new ArrayDeque<>(Arrays.asList(elements));
    //Задача 2:
    //Используйте ArrayDeque как стек: добавьте элементы и извлеките их в обратном порядке.
    public void addElement(int element) {
        arrayDeque.push(element);
    }
    public void removeElement() {
        arrayDeque.pop();
    }
    //Задача 3:
    //Используйте ArrayDeque как очередь: добавьте элементы в начало и конец, извлеките из обоих концов.

    public void addFirstElement(int element) {
        arrayDeque.addFirst(element);
    }
    public void addLastElement(int element) {
        arrayDeque.addLast(element);
    }
    public void removeFirstElement() {
        arrayDeque.removeFirst();
    }
    public void removeLastElement() {
        arrayDeque.removeLast();
    }

}
