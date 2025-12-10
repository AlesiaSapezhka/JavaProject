package practice7.exceptions;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundExceptionExample {
//   1. Условие задачи:
//   Напишите программу, которая пытается открыть файл с именем "data.txt". Если файл не найден, программа должна обработать исключение и вывести сообщение: "Файл не найден".
    public static void main (String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("data.txt");
        }
        catch (FileNotFoundException e){
            System.out.println("File not found " + e.getMessage());
        }
        finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Ошибка закрытия файла: " + e.getMessage());
                }
            }
        }
    }
}
