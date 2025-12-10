package practice7.generics;

import java.util.ArrayList;
import java.util.List;

public class NumberBox <T extends Number>{
    // Задача: Напишите обобщённый метод, который принимает List<T extends Number> и вычисляет сумму элементов.
    private final List<T> list;

    public NumberBox(List<T> list) {
        this.list = list;
    }

    public double getSum(){
        double sum = 0;
        for (T number : list) {
            sum += number.doubleValue();
        }
        return sum;
    }
}
