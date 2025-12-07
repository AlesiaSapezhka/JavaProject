package practice7.generics;

public class Storage <T>{
    T item;
    public Storage(T item){
        this.item = item;
    }
    void set(T item){
        this.item = item;
    }
    T getItem(){
        return item;
    }
}
