package practice6.hashSet;
import java.util.HashSet;

public class Task1 {
    // Задача 1:
    // Создайте HashSet из 5 чисел и выведите его содержимое.

    HashSet<Integer> numbers = new HashSet<>();
    public void addNumber(int number) {
        numbers.add(number);
    }
    public void printNumbers() {
        numbers.forEach(element -> System.out.println(element));
    }
}
