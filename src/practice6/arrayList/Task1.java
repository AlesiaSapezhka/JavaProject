package practice6.arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {
    // Создайте ArrayList из 5 чисел.
    Integer [] numbersArray = {6,8,9,4,3};
    ArrayList<Integer> numbersArrayList = new ArrayList<>(Arrays.asList(numbersArray));

    // Метод для добавления числа в конец.
    public void addNumber(Integer number) {
        numbersArrayList.add(number);
    };

    // Метод для выведа всего списка.
    public void showArray(){
        System.out.println(numbersArrayList);
    }
}
