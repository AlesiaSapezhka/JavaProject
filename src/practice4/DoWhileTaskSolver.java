package practice4;

import java.util.Scanner;

public class DoWhileTaskSolver {
    static void main(String[] args) {
    // 1. Запрос положительного числа
    positiveNumber();

    // 2. Проверка пароля
    checkPassword();

    // 3. Вывод чисел от 1 до 10 с использованием do-while
    printNumbersFromOneToTen();

    // 4. Завершение программы по команде "exit"
    exitProgram();

    // 5. Подсчёт количества цифр в числе
    countDigitsFromNumber();
    }

    //1. Запрос положительного числа
    public static void positiveNumber(){
        Scanner scanner = new Scanner(System.in);

        int numberFromConsole;
        do {
            System.out.print("Enter number ");
            numberFromConsole = scanner.nextInt();
        }
        while (numberFromConsole<0);
        System.out.print("Positive number found");
    }

    //2. Проверка пароля
    public static void checkPassword(){
        Scanner scanner = new Scanner(System.in);
        String password = "Hello";
        do {
            System.out.print("Enter password ");
            password = scanner.nextLine();
        } while ( !password.equals("hello"));
        System.out.print("Password entered correctly");
    }

    //3. Вывод чисел от 1 до 10 с использованием do-while
    public static void printNumbersFromOneToTen(){
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i<=10);
    }

    //4. Завершение программы по команде "exit"
    public static void exitProgram(){
        Scanner scanner = new Scanner(System.in);
        String secretWord = "Hello";
        do {
            System.out.print("Enter password ");
            secretWord = scanner.nextLine();
        } while ( !secretWord.equals("exit"));
        System.out.print("Word entered correctly");

    }

    //5. Подсчёт количества цифр в числе
    public static void countDigitsFromNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number ");
        int numberFromConsole = scanner.nextInt();

        int count = 0;
        do { if (numberFromConsole!=0) {
            numberFromConsole = numberFromConsole / 10;
            count++;
        } else System.out.println("Zero");
        } while (numberFromConsole!=0);
        System.out.println(count);
    }
}
