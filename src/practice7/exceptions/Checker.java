package practice7.exceptions;

public class Checker {
    public static void main(String[] args) throws AgeCheckException, EmailCheckException {
        ageChecker(9);
        ageChecker(-8);
        emailChecker("789@");
        emailChecker("908ksoss");
        emailChecker("alesia@gmail.com");

    }

    // 3. Условие задачи: Разработайте метод, который проверяет валидность возраста пользователя.
    // Если возраст меньше 0 или больше 150, метод должен выбрасывать проверяемое исключение.
    public static void ageChecker (int age) throws AgeCheckException{
        if (age<0 || age >150){
            throw new AgeCheckException("Not valid age");
        } else {
            System.out.println("Age is valid");
        }
    }

    // 4. Условие задачи: Напишите функцию, которая принимает строку в качестве аргумента и проверяет, является ли строка правильным электронным адресом.
    // Если строка не удовлетворяет критериям, функция должна выбрасывать непроверяемое исключение.

    public static void emailChecker (String email) throws EmailCheckException{
        if (email.contains("@") && email.length()>=10){
            System.out.println("Email is valid");
        } else {
            throw new EmailCheckException("Not valid email");
        }
    }
}
