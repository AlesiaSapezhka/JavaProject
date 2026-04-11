package PreparationsForInterview.RandomTasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {

        // Список строк {"мама", "мыла", "раму")
        // Приняла список слов а вернуть предложение с большой буквы слова разделены пробелами и в конце точка.
        List<String> words = Arrays.asList("мама", "мыла", "раму");
        String firstString = words.get(0).substring(0,1).toUpperCase()+words.get(0).substring(1,3);

        String sentence = words.stream().
                skip(1)
                .collect(Collectors.joining(" ", " ", "."));
        System.out.println(firstString + sentence);
    }
}
