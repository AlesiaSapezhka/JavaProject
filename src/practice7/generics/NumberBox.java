package practice7.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class NumberBox <T extends Number>{
    // Задача: Напишите обобщённый метод, который принимает List<T extends Number> и вычисляет сумму элементов.
    List<T> list = new ArrayList<>();

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
