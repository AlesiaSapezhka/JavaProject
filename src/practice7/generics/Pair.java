package practice7.generics;

public class Pair <T,U> {
    // Создайте класс Pair, который может хранить два объекта разных типов.
    // Класс должен позволять получать и устанавливать каждый из этих объектов.

    T first;
    U second;
    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public void setFirst(T first){
        this.first = first;
    };
    public T getFirst(){
        return first;
    }

    public void setSecond(U second){
        this.second = second;
    };
    public U geSecond(){
        return second;
    }

}
