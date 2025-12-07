package practice6.linkedList;

import java.util.LinkedList;

public class Task3 {
    //        Задача 3:
    // Создайте LinkedList, содержащий несколько строк.
    // Напишите программу, которая печатает первый и последний элементы списка.

    LinkedList<String> linkedList = new LinkedList<>();
    public void printFirstAndLast(LinkedList<String> linkedList) {
       if(!linkedList.isEmpty()){
           String firstElement = linkedList.getFirst();
           String lastElement = linkedList.getLast();
           System.out.println("First element: " + firstElement + ". Last element: " + lastElement);
       }

    }
}
