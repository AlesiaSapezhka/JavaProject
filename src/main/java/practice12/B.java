package practice12;
//Задача 6:
public class B {
  B b = new B(); // создание объекта внутри класса

    public int show() {
        return (true ? null : 0); // метод должен вернуть инт, а null не является интом
    }

    public static void main(String[] args) {
        B b = new B();
        b.show();
    }
}