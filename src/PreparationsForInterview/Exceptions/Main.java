package PreparationsForInterview.Exceptions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Стек с дженериками
        // Реализация обобщённого стека.
        //
        //
        //Связанная пара
        // Класс Pair<K, V> с методом toString().
        //
        //

        //
        //
        //Безопасное деление
        // Метод divide() с проверкой деления на 0.
        //
        //
        //Отрицательный баланс
        // Собственное исключение при превышении остатка на счёте.
        //
        //
        //Обмен элементов
        // Метод swap() для обмена элементов списка.
        //
        //
        //Безопасный парсер
        // Метод parseInt() с Optional.
        //
        //
        //Поиск в Map с ошибкой
        // Метод получения значения по ключу с исключением.
        //
        //
        //Обобщённый валидатор
        // Интерфейс Validator<T> и реализация для строк.
        //
        //
        //Только положительные
        // Коллекция с ограничением на знак.
    }

    //Печать любого списка
    // Метод, выводящий элементы списка произвольного типа.
    public static void printElements(List<?> list) {
        list.forEach(System.out::println);
    }

    //Минимум из списка
    // Обобщённый метод, возвращающий минимальный элемент.
    public static <T extends Comparable<T>> T returnMinElement(List<T> list) {
        T minimum = list.get(0);
        for (int i = 0; i <= list.size(); i++) {
            T current = list.get(i);
            if (current.compareTo(minimum) < 0) {
                minimum = current;
            }
        }
        return minimum;
    }

    //Массив в список
    // Метод преобразования массива в список.
    public static <T> List<T> convertArrayIntoList(T[] array) {
        List<T> list = new ArrayList();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        return list;
    }

    // Посчитать сколько раз встречается буква в строке
    public static int countLettersInWord(String word, char letter) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }

    //Исключение при пустом списке
    // Проверка на пустоту с выбросом исключения.
    public static boolean ifListIsEmpty(List list) {
        if (list.isEmpty()) {
            throw new EmptyListException("Empty list");
        } else {
            return true;
        }
    }

    // Вернуть какое число встречается чащё всего в массиве
    public static void maxNumberOfLuckyNumber(ArrayList<Integer> array) {
        HashMap<Integer, Integer> count = new HashMap();
        for (int i = 0; i < array.size(); i++) {
            int num = array.get(i);

            if (count.containsKey(num)) {
                count.put(num, count.get(num) + 1);
            } else {
                count.put(num, 1);
            }
        }
        int maxCount = 0;
        int max = count.get(0);
    }
}
