package practice6.linkedList;

import java.util.LinkedList;

public class Task3 {
    //        Задача 3:
    // Создайте LinkedList, содержащий несколько строк.
    // Напишите программу, которая печатает первый и последний элементы списка.

    LinkedList linkedList = new LinkedList();
    public void printFirstAndLast(LinkedList linkedList) {
       if(!linkedList.isEmpty()){
           String firstElement = linkedList.getFirst().toString();
           String lastElement = linkedList.getLast().toString();
           System.out.println("First element: " + firstElement + ". Last element: " + lastElement);
       }

    }
}
