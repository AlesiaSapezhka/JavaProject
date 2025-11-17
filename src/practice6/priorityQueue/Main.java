package practice6.priorityQueue;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
    // Создайте PriorityQueue и добавьте 5 чисел. Выведите их в порядке удаления.
    Task1 task1 = new Task1();
    task1.addElement(600);
    task1.addElement(-7);
    task1.addElement(8);
    task1.addElement(90);
    task1.addElement(10);
    System.out.println(task1.priorityQueue);
    task1.removeElement();
    }
}
