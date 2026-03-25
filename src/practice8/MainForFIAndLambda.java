package practice8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class MainForFIAndLambda {
    public static void main(String[] args) {
        // Задача1: Напишите интерфейс MathOperation, который принимает два числа и возвращает результат операции. Реализуйте его с помощью лямбда-выражений: сложение, вычитание, умножение, деление
        MathOperators add = (x,y) -> x+y;
        MathOperators sub = (x,y) -> x-y;
        MathOperators mul = (x,y) -> x*y;
        MathOperators div = (x,y) -> x/y;


        // Задача2: Создайте анонимный класс, реализующий интерфейс Runnable, который выводит сообщение "Hello from anonymous class!".
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous class!");
            }
        };
        r.run();
        Runnable r2 = ()->System.out.println("Hello from anonymous class!");
        r2.run();

        // Задача3: Напишите лямбду, которая проверяет, является ли число чётным.
        Predicate <Integer> isNumberEven = number -> number%2==0;
        System.out.println(isNumberEven.test(9));

        // Задача4: Создайте лямбду, которая принимает строку и возвращает её длину.
        Function <String, Integer> returnSreungLength = (string) -> string.length();
        System.out.println(returnSreungLength.apply("hello"));

        // Задача5: Напишите лямбду, которая принимает строку и печатает её в консоль.
        Consumer<String> printString = (string) -> System.out.println(string);
        printString.accept("hello");


    }
}
