package practice4;
import java.util.Scanner;


public class IfElseTaskSolver {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Определение знака числа
        signOfNumber(scanner);

        // 2. Поиск наибольшего из двух чисел
        maxNumber(scanner);

        // 3. Вывод оценки по шкале 1–5
        markDescription(scanner);

        // 4. Проверка на чётность
        isNumberEven(scanner);

        // 5. Определение размера скидки по возрасту
        discountValue(scanner);

        // 6. Оценка результата теста по баллам
        testResultsDescription (scanner);

    }

    // 1. Определение знака числа
    public static void signOfNumber(Scanner scanner){
       System.out.print("Введите число ");
       int valueFromConsole = scanner.nextInt();

        if (valueFromConsole > 0) {
            System.out.println("Число положительно");
        } else if (valueFromConsole <0){
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Цифра равна нулю");
        }
    }

    // 2. Поиск наибольшего из двух чисел
    public static void maxNumber (Scanner scanner){
       System.out.print("Введите число1 ");
       int a= scanner.nextInt();

       System.out.print("Введите число2 ");
       int b = scanner.nextInt();

       if (a > b){
           System.out.println("Максимальное число: " + a);
       } else if (a==b){
           System.out.println("Числа равны");
       }
       else {
           System.out.println("Максимальное число: " + b);
       }
    }

   // 3. Вывод оценки по шкале 1–5
   public static void markDescription(Scanner scanner){
       System.out.print("Введите оценку ");
       int mark = scanner.nextInt();

        if (mark == 5){
            System.out.println("Отлично");
        } else if (mark == 4){
            System.out.println("Хорошо");
        } else if (mark == 3){
            System.out.println("Удовлетворительно");
        } else if (mark == 2 || mark == 1) {
            System.out.println("Неудовлетворительно");
        } else {
            System.out.println("Введенная оценка не входит в промежуток от 1 to 5");
        }
    }

    // 4. Проверка на чётность
   public static void isNumberEven (Scanner scanner){
       System.out.print("Введите число ");
       int a = scanner.nextInt();

       String result = "";
       if (a%2==0){
           result = "Число четное";
       } else {
           result = "Число нечетное";
       }
       System.out.println(result);
    }

    // 5. Определение размера скидки по возрасту
   public static void discountValue (Scanner scanner) {
       System.out.print("Введите взраст ");
       int age = scanner.nextInt();
       String discount = "";
       if (age >0 && age < 18) {
               discount = "Сумма скидки - 25%";
           } else if (age >= 65 && age<=105) {
               discount = "Сумма скидки - 30%";
           } else {
               discount = "Скидка не предоставляется";
           }
           System.out.println(discount);
       }

  // 6. Оценка результата теста по баллам
   public static void testResultsDescription (Scanner scanner){
       System.out.print("Введите результат теста ");
       int testResult = scanner.nextInt();
       
       if (testResult >= 0 && testResult <= 100) {
           if (testResult >= 90) {
               System.out.println("Отлично");
           } else if (testResult >= 75 && testResult <= 89) {
               System.out.println("Хорошо");
           } else if (testResult >= 60 && testResult <= 74) {
               System.out.println("Удовлетворительно");
           } else {
               System.out.println("Неудовлетворительно");
           }
       }
    }
}
