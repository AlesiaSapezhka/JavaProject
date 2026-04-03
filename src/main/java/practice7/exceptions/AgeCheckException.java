package practice7.exceptions;

public class AgeCheckException extends Exception {
    // Создание собственного проверяемого исключения
    public AgeCheckException(String message){
        super(message);
    };
}
