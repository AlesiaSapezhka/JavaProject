package practice9;

public class Counter {
    //Условие задачи: Напишите класс Counter с методом increment, увеличивающим значение счётчика.
    private int counter;

    public synchronized void increment(){
        counter++;
    }

    public int getCounter(){
        return counter;
    }
}
