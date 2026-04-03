package practice4;

import java.util.Scanner;

public class WhileTaskSolver {

    static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 1. Вычисление факториала с помощью while
    System.out.println("Факториал числа:" + factorial(scanner));

    // 2. Вывод всех чётных чисел до заданного
    printEvenNumbers(scanner);

    // 3. Обратный отсчёт от введённого числа до 1
    printNumbers(scanner);
    }

    // 1. Вычисление факториала с помощью while
    public static int factorial (Scanner scanner){
        System.out.print("Введите число ");
        int numberFromConsole = scanner.nextInt();
        int result = 1;
        int i = 1;
        while (i<=numberFromConsole){
            result = result * i;
            i++;
        }
        return result;

    }
    //2. Вывод всех чётных чисел до заданного
    public static void printEvenNumbers (Scanner scanner){
        System.out.print("Введите число ");
        int numberFromConsole = scanner.nextInt();
        int startNumber = 1;
        System.out.print("Четные числа: ");
        while (startNumber<=numberFromConsole){
            if (startNumber%2==0){
                System.out.print(startNumber + ", ");

            }
            startNumber++;
        }
        System.out.println();
    }

    //3. Обратный отсчёт от введённого числа до 1
    public static void printNumbers (Scanner scanner) {
        System.out.print("Введите положительное число ");
        int numberFromConsole = scanner.nextInt();
        if (numberFromConsole>0) {
            System.out.print("Числа в порядке убывания: ");
            while (numberFromConsole >= 1) {
                System.out.print(numberFromConsole + ", ");
                numberFromConsole--;
            }
        } else System.out.print("Введено неверное число");
    }
}