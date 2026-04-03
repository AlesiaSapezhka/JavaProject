package PreparationsForInterview.OOPInJava;

public abstract class Shape {
    //Создай абстрактный класс Shape с методом double getArea().
    // Создай наследников: Circle, Rectangle, Triangle. У каждого — реализация метода getArea() по формуле.
    // Реализуй метод printArea(Shape s), который выводит результат.
    public abstract double getArea();
    public static void printArea(Shape s){
        s.getArea();
    }
}
