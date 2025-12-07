package practice7.exceptions;

public class EmailCheckException extends RuntimeException{
    // Создание собственного непроверяемого исключения
    public EmailCheckException(String message){
        super(message);
    }
}
