package practice6.arrayList;

import java.util.ArrayList;

public class Task5 {
    //Создайте ArrayList из целых чисел.
    ArrayList<Integer> listOfNumbers = new ArrayList<>();

    // Напишите программу, которая находит и выводит максимальное число из списка.
    public Integer maxNumber (ArrayList<Integer> listOfNumbers) {
        final Integer[] max = {listOfNumbers.get(0)};

        listOfNumbers.forEach(num -> {
            if (num> max[0]){
                max[0] =num;
            };
        });
        return max[0];
    }
}
