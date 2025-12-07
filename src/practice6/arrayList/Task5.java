package practice6.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Task5 {
    //Создайте ArrayList из целых чисел.
    ArrayList<Integer> listOfNumbers = new ArrayList<>();

    // Напишите программу, которая находит и выводит максимальное число из списка.
    public Integer maxNumber (ArrayList<Integer> listOfNumbers) {
        return Collections.max(listOfNumbers);
    }
}
