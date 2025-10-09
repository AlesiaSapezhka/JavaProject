package practice4;

import java.util.Scanner;

public class DoWhileTaskSolver {
    static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    // 1. Запрос положительного числа
    positiveNumber(scanner);

    // 2. Проверка пароля
    checkPassword(scanner);

    // 3. Вывод чисел от 1 до 10 с использованием do-while
    printNumbersFromOneToTen();

    // 4. Завершение программы по команде "exit"
    exitProgram(scanner);

    // 5. Подсчёт количества цифр в числе
    countDigitsFromNumber(scanner);
    }

    //1. Запрос положительного числа
    public static void positiveNumber(Scanner scanner){
        int numberFromConsole;
        do {
            System.out.print("Введите число ");
            numberFromConsole = scanner.nextInt();
        }
        while (numberFromConsole<0);
        System.out.print("Позитивное число найдено");
    }

    //2. Проверка пароля
    public static void checkPassword(Scanner scanner){
        String password = "Hello";
        do {
            System.out.print("Введите пароль ");
            password = scanner.nextLine();
        } while ( !password.equals("hello"));
        System.out.print("Пароль введен корректно");
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
    public static void exitProgram(Scanner scanner){
        String secretWord = "Hello";
        do {
            System.out.print("Введите команду ");
            secretWord = scanner.nextLine();
        } while ( !secretWord.equals("exit"));
        System.out.print("Команда введена корректно");

    }

    //5. Подсчёт количества цифр в числе
    public static void countDigitsFromNumber(Scanner scanner){
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
