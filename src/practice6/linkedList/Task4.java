package practice6.linkedList;

import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicReference;

public class Task4 {
//        Задача 4:
//        Создайте LinkedList из целых чисел. Напишите программу, которая вычисляет сумму элементов списка.

    LinkedList <Integer> integers = new LinkedList();
    public Integer sum(LinkedList <Integer> integers) {
        AtomicReference<Integer> sum = new AtomicReference<>(0);
        integers.forEach(i -> sum.updateAndGet(v -> v + i));
        return sum.get();
    }
}
