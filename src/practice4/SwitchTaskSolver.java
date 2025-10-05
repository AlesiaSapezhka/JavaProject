package practice4;
import java.util.Scanner;

public class SwitchTaskSolver {

    static void main(String[] args) {
        // Вывод дня недели по номеру
        dayOfWeek();

        // Стоимость билета по дню недели
        costOfTicket();

        // Перевод числовых оценок в буквенные (A–F)
        convertNumberMarkIntoLetterMark();

        // Обработка текстовых команд:
        convertCommandIntoText();

        //Простой калькулятор с использованием switch
        calculator();
    }

    // Вывод дня недели по номеру
    public static void dayOfWeek(){
        System.out.print("Enter number from 1 to 7 ");
        Scanner scanner = new Scanner(System.in);
        int valueFromConsole = scanner.nextInt();

        String dayOfWeek = "";
        switch (valueFromConsole){
            case 1:
                dayOfWeek = "Monday";
                break;
            case 2:
                dayOfWeek = "Tuesday";
                break;
            case 3:
                dayOfWeek =  "Wednesday";
                break;
            case 4:
                dayOfWeek =  "Thursday";
                break;
            case 5:
                dayOfWeek =  "Friday";
                break;
            case 6:
                dayOfWeek =  "Saturday";
                break;
            case 7:
                dayOfWeek =  "Sunday";
                break;
            default:
                dayOfWeek =  "Invalid day";
        }
        System.out.println(dayOfWeek);
    }

   //Стоимость билета по дню недели
   public static void costOfTicket(){
        System.out.print("Enter number of a day from 1 to 7 ");
        Scanner scanner = new Scanner(System.in);
        int numberFromConsole = scanner.nextInt();
            switch (numberFromConsole){
            case 1, 2, 3, 4, 5 -> System.out.print("Ticket cost: 5$");
            case 6,7 -> System.out.print("Ticket cost: 7$");
            default -> System.out.println("Invalid day of a week number");
        }
   }

    // Перевод числовых оценок в буквенные (A–F)
    public static void convertNumberMarkIntoLetterMark(){
        System.out.print("Enter number mark from 0 to 100 ");
        Scanner scanner = new Scanner(System.in);
        int numberFromConsole = scanner.nextInt();

        if (numberFromConsole >= 90 && numberFromConsole <= 100){
            System.out.print("Your mark is A");
        } else if (numberFromConsole >= 80 && numberFromConsole <= 89){
            System.out.print("Your mark is B");
        } else if ( numberFromConsole >= 70 && numberFromConsole <= 79) {
            System.out.print("Your mark is C");
        } else if (numberFromConsole >= 60 && numberFromConsole <= 69){
            System.out.print("Your mark is D");
        } else if (numberFromConsole >= 0 && numberFromConsole <= 60){
            System.out.print("Your mark is E");
        } else {
            System.out.print("Invalid mark");
        }
    }

    //Обработка текстовых команд:
    public static void convertCommandIntoText(){
        System.out.print("Enter command ");
        Scanner scanner = new Scanner(System.in);
        String textFromConsole = scanner.nextLine();

        switch (textFromConsole){
            case "start":
                System.out.print("System started");
                break;
            case "stop":
                System.out.print("System stopped");
                break;
            case "restart":
                System.out.print("System restarted");
                break;
            case "status":
                System.out.print("System status");
                break;
            default:
                System.out.print("Command is not known");
        }
    }

    //Простой калькулятор с использованием switch
     public static void calculator (){
        System.out.print("Enter first number ");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();

        System.out.print("Enter second number ");
        Scanner scanner1 = new Scanner(System.in);
        int secondNumber = scanner1.nextInt();

        System.out.print("Enter operator ");
        Scanner scanner2 = new Scanner(System.in);
        String operator = scanner2.nextLine();

        switch (operator){
             case "+":
                 System.out.println("Result of sum: " + (firstNumber * secondNumber));
                 break;
             case "-":
                 System.out.println("Result of subtraction: " + (firstNumber - secondNumber));
                 break;
            case "/":
                if (secondNumber != 0){
                    System.out.println("Result of division: " + (firstNumber / secondNumber));
                } else  System.out.println("Not allowed to divide to zero");
                break;
            case "*":
                System.out.println("Result of multiplication: " + (firstNumber * secondNumber));
                break;
            default:
                System.out.println("Invalid operator");
        }
     }
}
