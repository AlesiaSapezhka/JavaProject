package practice6.linkedList;

import java.util.LinkedList;

public class Task2 {
    //    Задача 2:
    //    Реализуйте очередь задач с LinkedList. Добавьте 3 задачи и обработайте их в порядке поступления.
    LinkedList<String> tasks = new LinkedList<>();

    public void addTask(String task) {
        tasks.add(task);
    }
    public void print (){
        System.out.println(tasks);
    }
    public void performTask(){
        if (!tasks.isEmpty()){
            tasks.poll();
            System.out.println("Task was fulfilled");
        }
        else {
            System.out.println("Task are empty");
        }
    }
}
