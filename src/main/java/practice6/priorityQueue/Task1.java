package practice6.priorityQueue;

import java.util.PriorityQueue;

public class Task1 {
    // Создайте PriorityQueue и добавьте 5 чисел. Выведите их в порядке удаления.

    PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
    public void addElement(Integer element){
        priorityQueue.add(element);
    }

    public void removeElement(){
        while (!priorityQueue.isEmpty()) {
          System.out.println(priorityQueue.poll());
        }
    }
}
