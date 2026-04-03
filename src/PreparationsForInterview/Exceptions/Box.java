package PreparationsForInterview.Exceptions;

import java.util.ArrayList;
import java.util.List;
// Универсальная коробка
// Класс Box<T> с методами put() и get().
public class Box <T> {
    List<T> elements;
    public Box(){
        this.elements = new ArrayList<>();
    }
    public void put(T element){
        this.elements.add(element);
    }

    public T get(int index){
        return this.elements.get(index);
    }
}
