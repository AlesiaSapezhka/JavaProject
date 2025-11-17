package practice6.hashSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Task2 {
    // Задача 2:
    // Добавьте в HashSet 10 чисел. Проверьте, содержит ли он заданное число.
    Integer [] numbersArray = {6,8,9,4,3,8,90,88,77,54,32};
    HashSet<Integer> numbersList = new HashSet<>(Arrays.asList(numbersArray));

    public boolean isContainNumber(Integer numberToSearch){
        return numbersList.contains(numberToSearch);
    }



}
