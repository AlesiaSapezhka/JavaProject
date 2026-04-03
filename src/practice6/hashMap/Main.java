package practice6.hashMap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Задача 1:
        Task1 task1 = new Task1();
        task1.addPair("John", 8);
        task1.addPair("Joe", 88);
        task1.addPair("Jane", 8);
        task1.addPair("Kate", 18);
        task1.addPair("Alex", 27);
        System.out.println(task1.hashMap);

        //Задача 2:
        //Проверьте, есть ли определённое имя в HashMap.
        System.out.println(task1.containsName("John1"));

        //Задача 3:
        //Реализуйте метод, который печатает из HashMap всех пользователей младше 18 лет.
        task1.printChildMembers();
    }
}
