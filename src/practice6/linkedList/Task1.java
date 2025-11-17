package practice6.linkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class Task1 {
//    Задача 1:
//    Создайте LinkedList и добавьте в него 5 строк. Выведите все элементы списка.
LinkedList<String> names = new LinkedList<>();

public void addName(String name){
    names.add(name);
}
public void print (){
    System.out.println(names);
}

public void showNames(){
    names.forEach(element -> System.out.println(element));
}
}
