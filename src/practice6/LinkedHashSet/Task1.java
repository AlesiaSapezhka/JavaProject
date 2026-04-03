package practice6.LinkedHashSet;

import java.util.LinkedHashSet;

public class Task1 {
    //   Задача 1:
    //   Создайте LinkedHashSet и добавьте в него 5 строк. Проверьте порядок элементов при выводе.

    LinkedHashSet hashSet = new LinkedHashSet();

    public void addElement(String element) {
        if(!hashSet.contains(element)){
            hashSet.add(element);
        } else {
            System.out.println("Duplicate element");
        }

    }

    //   Задача 2:
    //   Напишите метод, который добавляет элемент в LinkedHashSet, но не добавляет дубликаты.

    // метод выше уже и так работает без добавления дуюликатов, так как LHS их не допускает
}
