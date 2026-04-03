package practice4;

import java.util.Scanner;

public class BreakContinueTaskSolver {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Сумма чисел до первого отрицательного (использовать break)
        sumOfPositiveNumbers(scanner);

        // 2. Пропуск чисел, делящихся на 3 (использовать continue)
        printNumbersNotDividedToThree();

        // 3. Вывод только положительных чисел (использовать continue)
        printPositiveNumbers(scanner);

        // 4. Ввод строк до команды "stop" (использовать break)
        printStringUntilCommandStop(scanner);
    }

    // 1. Сумма чисел до первого отрицательного (использовать break)
    public static void sumOfPositiveNumbers(Scanner scanner) {
        int numberFromConsole;
        int sum = 0;
        while (true) {
            System.out.print("Введите число ");
            numberFromConsole = scanner.nextInt();
            if (numberFromConsole < 0) {
                break;
            }
            sum = sum + numberFromConsole;
        }
        System.out.print("Сумма введенных чисел: " + sum);
    }

    //2. Пропуск чисел, делящихся на 3 (использовать continue)
    public static void printNumbersNotDividedToThree() {
       for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.print(i + ", ");
        }
       System.out.println("Числа, которые не делятся на три : ");
    }

    //3. Вывод только положительных чисел (использовать continue)
    public static void printPositiveNumbers(Scanner scanner) {

        int numberFromConsole;
        do {
            System.out.print("Введите число : ");

            numberFromConsole = scanner.nextInt();
            if (numberFromConsole < 0) {
                continue;
            }
            if (numberFromConsole == 0) {
                break;
            }
            System.out.println("Положительные числа: " + numberFromConsole + ", ");
            System.out.println();
        } while (true);
    }

    //4. Ввод строк до команды "stop" (использовать break)
    public static void printStringUntilCommandStop(Scanner scanner) {
        String wordFromConsole;

        while (true) {
            System.out.print("Введите команду ");
            wordFromConsole = scanner.nextLine();
            if (wordFromConsole.equals("stop")) {
                break;
            }
            System.out.println("Введите команду: " + wordFromConsole);
        }
    }
}
