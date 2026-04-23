package clean_code;

public class MathOperations {
    // 1. Нарушение DRY (Don't Repeat Yourself) – дублирование кода

    // Один метод который можно вызывать с разным количеством переданных параметров
    public static int add(int [] array) {
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return sum;
        }
    }

