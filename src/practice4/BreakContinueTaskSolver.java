package practice4;

import java.util.Scanner;

public class BreakContinueTaskSolver {

    static void main(String[] args) {
        // 1. Сумма чисел до первого отрицательного (использовать break)
        sumOfPositiveNumbers();

        // 2. Пропуск чисел, делящихся на 3 (использовать continue)
        printNumbersNotDividedToThree();

        // 3. Вывод только положительных чисел (использовать continue)
        printPositiveNumbers();

        // 4. Ввод строк до команды "stop" (использовать break)
        printStringUntilCommandStop();
    }

    // 1. Сумма чисел до первого отрицательного (использовать break)
    public static void sumOfPositiveNumbers() {
        Scanner scanner = new Scanner(System.in);
        int numberFromConsole;
        int sum = 0;
        while (true) {
            System.out.print("Enter number ");
            numberFromConsole = scanner.nextInt();
            if (numberFromConsole < 0) {
                break;
            }
            sum = sum + numberFromConsole;
        }
        System.out.print("Sum of entered numbers:" + sum);
    }

    //2. Пропуск чисел, делящихся на 3 (использовать continue)
    public static void printNumbersNotDividedToThree() {
       for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.print(i + ", ");
        }
       System.out.println("Numbers which are not divide to three: ");
    }

    //3. Вывод только положительных чисел (использовать continue)
    public static void printPositiveNumbers() {
        Scanner scanner = new Scanner(System.in);

        int numberFromConsole;
        do {
            System.out.print("Enter Number: ");

            numberFromConsole = scanner.nextInt();
            if (numberFromConsole < 0) {
                continue;
            }
            if (numberFromConsole == 0) {
                break;
            }
            System.out.println("Value of positive numbers: " + numberFromConsole + ", ");
            System.out.println();
        } while (true);
    }

    //4. Ввод строк до команды "stop" (использовать break)
    public static void printStringUntilCommandStop() {
        Scanner scanner = new Scanner(System.in);
        String wordFromConsole;

        while (true) {
            System.out.print("Enter string ");
            wordFromConsole = scanner.nextLine();
            if (wordFromConsole.equals("stop")) {
                break;
            }
            System.out.println("Entered text: " + wordFromConsole);
        }
    }
}
