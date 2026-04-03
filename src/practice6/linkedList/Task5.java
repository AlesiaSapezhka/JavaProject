package practice6.linkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class Task5 {
    //    Задача 5:
    //    Используйте ListIterator для прохода по LinkedList в обоих направлениях.
    LinkedList linkedList = new LinkedList();

    public void element (LinkedList linkedList) {
        ListIterator<Integer> it = linkedList.listIterator();
        System.out.println("Елементы в порядке добавления");

        while (it.hasNext()) {
          Integer num = it.next();
          System.out.println(num);
        }
        System.out.println("Елементы в обратном порядке");
        while (it.hasPrevious()) {
            Integer num = it.previous();
            System.out.println(num);
        }
    }
}