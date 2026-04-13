package PreparationsForInterview;

public class Person {
    int age;
    //Проверка возраста с использованием объекта
    // Создать метод isAdult в классе Person, возвращающий true, если возраст ≥ 18.
    // Сравнить age с 18.
    // Работа с полем объекта.
    // Сравнивают строку, забывают this.

    boolean isAdult (int age){
        if (this.age < 18){
            return true;
        }else{
            return false;
        }
    }
}
