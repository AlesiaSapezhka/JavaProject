package practice4;
import java.util.Scanner;


public class IfElseTaskSolver {
    static void main(String[] args) {
        // 1. Определение знака числа
        signOfNumber();

        // 2. Поиск наибольшего из двух чисел
        maxNumber();

        // 3. Вывод оценки по шкале 1–5
        markDescription();

        // 4. Проверка на чётность
        isNumberEven();

        // 5. Определение размера скидки по возрасту
        discountValue();

        // 6. Оценка результата теста по баллам
        testResultsDescription ();

    }

    // 1. Определение знака числа
    public static void signOfNumber(){
       System.out.print("Enter number ");
       Scanner scanner = new Scanner(System.in);
       int valueFromConsole = scanner.nextInt();

        if (valueFromConsole > 0) {
            System.out.println("Number is positive");
        } else if (valueFromConsole <0){
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }
    }

    // 2. Поиск наибольшего из двух чисел
    public static void maxNumber (){
       System.out.print("Enter number1 ");
       Scanner scanner = new Scanner(System.in);
       int a= scanner.nextInt();

       System.out.print("Enter number2 ");
       Scanner scanner1 = new Scanner(System.in);
       int b = scanner1.nextInt();

       if (a > b){
           System.out.println("Max number: " + a);
       } else if (a==b){
           System.out.println("Numbers are equal");
       }
       else {
           System.out.println("Max number: " + b);
       }
    }

   // 3. Вывод оценки по шкале 1–5
   public static void markDescription(){
       System.out.print("Enter mark ");
       Scanner scanner = new Scanner(System.in);
       int mark = scanner.nextInt();

        if (mark == 5){
            System.out.println("Very nice");
        } else if (mark == 4){
            System.out.println("Nice");
        } else if (mark == 3){
            System.out.println("Good");
        } else if (mark == 2 || mark == 1) {
            System.out.println("Bad");
        } else {
            System.out.println("Mark is not included within grade from 1 to 5");
        }
    }

    // 4. Проверка на чётность
   public static void isNumberEven (){
       System.out.print("Enter number ");
       Scanner scanner = new Scanner(System.in);
       int a = scanner.nextInt();

       String result = "";
       if (a%2==0){
           result = "Number is Even";
       } else {
           result = "Number is Odd";
       }
       System.out.println(result);
    }

    // 5. Определение размера скидки по возрасту
   public static void discountValue () {
       System.out.print("Enter age ");
       Scanner scanner = new Scanner(System.in);
       int age = scanner.nextInt();
       String discount = "";
       if (age >0 && age < 18) {
               discount = "Discount value: 25%";
           } else if (age >= 65 && age<=105) {
               discount = "Discount value: 30%";
           } else {
               discount = "No discount";
           }
           System.out.println(discount);
       }

  // 6. Оценка результата теста по баллам
   public static void testResultsDescription (){
       System.out.print("Enter test result value ");
       Scanner scanner = new Scanner(System.in);
       int testResult = scanner.nextInt();
       
       if (testResult >= 0 && testResult <= 100) {
           if (testResult >= 90) {
               System.out.println("Test result description - Very nice");
           } else if (testResult >= 75 && testResult <= 89) {
               System.out.println("Test result description - Nice");
           } else if (testResult >= 60 && testResult <= 74) {
               System.out.println("Test result description - Good");
           } else {
               System.out.println("Test result description - Not good");
           }
       }
    }
}
