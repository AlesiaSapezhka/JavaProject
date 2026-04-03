package practice6.arrayList;

import java.util.ArrayList;

public class Task2 {
    // Напишите программу, которая выводит все чётные числа из ArrayList.

    ArrayList<Integer> numbers = new ArrayList<>();

    // Метод для заполнения массива
    public void addNumber(Integer number) {
        numbers.add(number);
    };

    // Метод1 который выводит все чётные числа из ArrayList.
    public void printEvenNumbers () {
        numbers.forEach(
                number ->{
                    if (number % 2 == 0){
                        System.out.println(number);
                    }
                }
        );

    }

    // Метод2 который выводит все чётные числа из ArrayList.
    public ArrayList<Integer> returnEvenNumbers (ArrayList<Integer> numbers) {
        ArrayList<Integer> evenNumbersArray = new ArrayList<>();
        numbers.forEach(
                number ->{
                    if(number % 2 == 0){
                        evenNumbersArray.add(number);
                    }
                }
        );
        return evenNumbersArray;
    };

}
