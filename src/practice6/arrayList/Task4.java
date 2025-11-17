package practice6.arrayList;

import java.util.ArrayList;

public class Task4 {
    // Создайте ArrayList из целых чисел.
    ArrayList<Integer> integers = new ArrayList<>();

    // Напишите программу, которая вычисляет и выводит сумму всех чисел в списке.
    public Integer sumOfNumber (ArrayList<Integer> integers) {
        Integer sum = 0;
        for (Integer integer : integers) {
            sum += integer;
        }
        return sum;
    }

}
