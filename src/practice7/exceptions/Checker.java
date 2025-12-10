package practice7.exceptions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Checker {
    public static void main(String[] args)  {
        try {
            ageChecker(9);
        } catch (AgeCheckException e){
            System.out.println("Age error " + e.getMessage());
        }
        try {
            ageChecker(-8);
        } catch (AgeCheckException e){
            System.out.println("Age error " + e.getMessage());
        }
        try {
            emailChecker("789@");
        } catch (EmailCheckException e){
            System.out.println("Email error " + e.getMessage());
        }
        try {
            emailChecker("908ksoss");
        } catch (EmailCheckException e){
            System.out.println("Email error " + e.getMessage());
        }
        try {
            emailChecker("alesia@gmail.com");
        } catch (EmailCheckException e){
            System.out.println("Email error " + e.getMessage());
        }

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

    public static void emailChecker (String email) {
        String regex ="^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if (!matcher.matches()) {
            throw new EmailCheckException("Wrong email format " + email);
        }
        System.out.println("Email is valid: " + email);
    }
}