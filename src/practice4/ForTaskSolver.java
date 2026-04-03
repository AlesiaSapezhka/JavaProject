package practice4;

import java.util.Scanner;

public class ForTaskSolver {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Вывод чисел от 1 до 100, делящихся на 3
        numbersDividedByThree();

        // 2. Сумма чисел от 1 до n
        System.out.println("Сумма чисел от одного до введенного числа " + sumOfNumbersFromConsole(scanner));

        // 3. Таблица умножения для числа
        multiplyTable(scanner);

        //4. Проверка на простое число
        ifNumberIsSimple(scanner);

        //5. Вывод чисел от 1 до 10
        printNumbersFromOneToTen();

    }

    //1. Вывод чисел от 1 до 100, делящихся на 3
    public static void numbersDividedByThree() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) System.out.println(i);
        }
    }

    // 2. Сумма чисел от 1 до n
    public static int sumOfNumbersFromConsole (Scanner scanner) {
        System.out.print("Введите число ");
        int numberFromConsole = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= numberFromConsole; i++) {
            sum = sum+ i;
        }
        return sum;
    }

    //3. Таблица умножения для числа
    public static void multiplyTable (Scanner scanner) {
        System.out.print("Введите число ");
        int numberFromConsole = scanner.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(i + "*" + numberFromConsole + "=" + numberFromConsole * i);
        }
    }

    //4. Проверка на простое число
    public static void ifNumberIsSimple(Scanner scanner) {
        System.out.print("Введите число ");
        int numberFromConsole = scanner.nextInt();

        boolean numberIsSimple = true;
        if(numberFromConsole<=1){
            numberIsSimple = false;
            } else {
            for (int i=2; i<numberFromConsole; i++){
                if (numberFromConsole % i == 0) {
                    numberIsSimple = false;
                    break;
                }
            }
        }
        System.out.println("Число простое? - " + numberIsSimple);
    }

    //5. Вывод чисел от 1 до 10
    public static void printNumbersFromOneToTen (){
        for (int i = 1; i<=10; i++) {
            System.out.print(i + ", ");
        }
    }
}




