package practice6.hashSet;

import java.util.Arrays;
import java.util.HashSet;

public class Task4 {
    //Создайте HashSet, содержащий набор имен.
    // Напишите программу, которая проверяет, содержится ли ваше имя в множестве, и выводит соответствующее сообщение.

    String [] names = {"Alex", "Ivan", "Anna", "Alice", "Petr"};
    HashSet<String> namesList = new HashSet<>(Arrays.asList(names));

    public boolean ifListExistsGivenName(String name) {
        return namesList.contains(name);
    }
}
