package practice6.arrayList;

import java.util.ArrayList;

public class Task3 {
    // Создайте ArrayList из строк.
    ArrayList<String> words = new ArrayList<>();

    // Найдите в нём самую длинную строку и выведите её.
    public String maxString (ArrayList<String> listOfWords) {
        final String[] maxString = {""};
        listOfWords.forEach(word -> {
            if (word.length() > maxString[0].length()) {
                maxString[0] = word;
            }
        });
        return maxString[0];
    }

}
