package practice4;

import java.util.Scanner;

public class WhileTaskSolver {

    static void main(String[] args) {
    // 1. Вычисление факториала с помощью while
    System.out.println("Factorial of number:" + factorial());

    // 2. Вывод всех чётных чисел до заданного
    printEvenNumbers();

    // 3. Обратный отсчёт от введённого числа до 1
    printNumbers();
    }

    // 1. Вычисление факториала с помощью while
    public static int factorial (){
        System.out.print("Enter number ");
        Scanner scanner = new Scanner(System.in);
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
    public static void printEvenNumbers (){
        System.out.print("Enter number ");
        Scanner scanner = new Scanner(System.in);
        int numberFromConsole = scanner.nextInt();
        int startNumber = 1;
        System.out.print("Even numbers: ");
        while (startNumber<=numberFromConsole){
            if (startNumber%2==0){
                System.out.print(startNumber + ", ");

            }
            startNumber++;
        }
        System.out.println();
    }

    //3. Обратный отсчёт от введённого числа до 1
    public static void printNumbers () {
        System.out.print("Enter positive number ");
        Scanner scanner = new Scanner(System.in);
        int numberFromConsole = scanner.nextInt();
        if (numberFromConsole>0) {
            System.out.print("Numbers in descending order: ");
            while (numberFromConsole >= 1) {
                System.out.print(numberFromConsole + ", ");
                numberFromConsole--;
            }
        } else System.out.print("Invalid input");
    }
}