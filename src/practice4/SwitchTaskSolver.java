package practice4;
import java.util.Scanner;

public class SwitchTaskSolver {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Вывод дня недели по номеру
        dayOfWeek(scanner);

        // Стоимость билета по дню недели
        costOfTicket(scanner);

        // Перевод числовых оценок в буквенные (A–F)
        convertNumberMarkIntoLetterMark(scanner);

        // Обработка текстовых команд:
        convertCommandIntoText(scanner);

        //Простой калькулятор с использованием switch
        calculator(scanner);
    }

    // Вывод дня недели по номеру
    public static void dayOfWeek(Scanner scanner){
        System.out.print("Введите число от 1 до 7 ");
        int valueFromConsole = scanner.nextInt();

        String dayOfWeek = "";
        switch (valueFromConsole){
            case 1:
                dayOfWeek = "Понедельник";
                break;
            case 2:
                dayOfWeek = "Вторник";
                break;
            case 3:
                dayOfWeek =  "Среда";
                break;
            case 4:
                dayOfWeek =  "Четверг";
                break;
            case 5:
                dayOfWeek =  "Пятница";
                break;
            case 6:
                dayOfWeek =  "Суббота";
                break;
            case 7:
                dayOfWeek =  "Воскресенье";
                break;
            default:
                dayOfWeek =  "Указан неверный день";
        }
        System.out.println(dayOfWeek);
    }

   //Стоимость билета по дню недели
   public static void costOfTicket(Scanner scanner){
        System.out.print("Введите число от 1 до 7 ");
        int numberFromConsole = scanner.nextInt();
            switch (numberFromConsole){
            case 1, 2, 3, 4, 5 -> System.out.print("Стоимость билета: 5$");
            case 6,7 -> System.out.print("Стоимость билета: 7$");
            default -> System.out.println("Введен неверный день недели");
        }
   }

    // Перевод числовых оценок в буквенные (A–F)
    public static void convertNumberMarkIntoLetterMark(Scanner scanner){
        System.out.print("ведите оценку от 1 до 100");
        int numberFromConsole = scanner.nextInt();

        if (numberFromConsole >= 90 && numberFromConsole <= 100){
            System.out.print("Ваша оценка - A");
        } else if (numberFromConsole >= 80 && numberFromConsole <= 89){
            System.out.print("Ваша оценка - B");
        } else if ( numberFromConsole >= 70 && numberFromConsole <= 79) {
            System.out.print("Ваша оценка - C");
        } else if (numberFromConsole >= 60 && numberFromConsole <= 69){
            System.out.print("Ваша оценка - D");
        } else if (numberFromConsole >= 0 && numberFromConsole <= 60){
            System.out.print("Ваша оценка - E");
        } else {
            System.out.print("Введена неверная оценка");
        }
    }

    //Обработка текстовых команд:
    public static void convertCommandIntoText(Scanner scanner){
        System.out.print("Введите команду ");
        String textFromConsole = scanner.nextLine();
        String modifiedText =  textFromConsole.toLowerCase();
        switch (modifiedText){
            case "start":
                System.out.print("Система начала работу");
                break;
            case "stop":
                System.out.print("Система прекратила работу");
                break;
            case "restart":
                System.out.print("Система начала работу заново");
                break;
            case "status":
                System.out.print("Статус системы");
                break;
            default:
                System.out.print("Введена неизвестная команда");
        }
    }

    //Простой калькулятор с использованием switch
     public static void calculator (Scanner scanner){
        System.out.print("Введите число1 ");
        int firstNumber = scanner.nextInt();

        System.out.print("Введите число2 ");
        int secondNumber = scanner.nextInt();

        System.out.print("Введите оператор ");
        Scanner scanner2 = new Scanner(System.in);
        String operator = scanner2.nextLine();

        switch (operator){
             case "+":
                 System.out.println("Результат сложения: " + (firstNumber + secondNumber));
                 break;
             case "-":
                 System.out.println("Результат вычитания: " + (firstNumber - secondNumber));
                 break;
            case "/":
                if (secondNumber != 0){
                    System.out.println("Результат деления: " + (firstNumber / secondNumber));
                } else  System.out.println("Деление на ноль запрещено");
                break;
            case "*":
                System.out.println("Результат умножения: " + (firstNumber * secondNumber));
                break;
            default:
                System.out.println("Неверный оператор");
        }
     }
}
