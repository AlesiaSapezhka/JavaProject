package practice7.exceptions;


public class ArithmeticExceptionExample {
    // 2. Условие задачи: Напишите метод, который принимает на вход два числа и выполняет их деление.
    // Обработайте ситуацию, когда второе число равно нулю, чтобы избежать исключения при делении.
    public static void main(String[] args) {
        System.out.println(division(5, 2));
        System.out.println(division(5, 0));
    }

    public static int division(int num1, int num2) {
        try {
            return num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println("Division to zero is forbitten " + e.getMessage());
            return 0;
        }
    }
}