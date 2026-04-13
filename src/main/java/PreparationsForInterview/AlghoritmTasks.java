package PreparationsForInterview;

import java.util.*;
import java.util.stream.Collectors;

public class AlghoritmTasks {
    public static void main(String[] args) {
//        System.out.println(ifStringPalindrom(" h eell e e H"));
        int [] arr1 = new int[]{9,10,34};
        int [] arr2 = new int[]{8,67,234};

//        System.out.println(arrayNumbersSum(arr));
//        System.out.println(arrayNumbersSum(arr));
//        System.out.println( ifNumberIsSimple(5));
//        System.out.println(factorial(5));
//        System.out.println(countVowels("Helloo  O 767 65$#"));
//        System.out.println(findSecondMaxNumber(arr));
//        System.out.println(ifAnagrams("moma", "MAOM  "));
//        List<String> strings = new ArrayList<>(Arrays.asList("Hello", "World", "hello", "hi"));
//        List<Integer> strings1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,5,4,3,2,1));
        // Собрать строку из массива слов, разделяя пробелами.
//        String [] words = {"hello", "world", "java"};
//        String firstWord= words[0].substring(0,1).toUpperCase()+words[0].substring(1,5);
//        List <String> wordsList = Arrays.asList(words);
//        String sentence = wordsList.stream().skip(1).collect(Collectors.joining(" ", "", "."));
//        System.out.printf(firstWord + " " + sentence);

        //Вывод элементов очереди
        // Использовать Queue для вывода элементов в порядке добавления.
        // Добавлять через offer, извлекать через poll.	poll удаляет элемент из очереди.
        // Используют peek без удаления.

//        Queue <String> queue = new LinkedList<>();
//        queue.offer("Hi");
//        queue.offer("Hi1");
//        queue.offer("Hi2");
//
//        while (!queue.isEmpty()) {
//            System.out.println(queue.poll());
//        }

        // Слияние двух списков	Объединить два списка в один.	Создать новый список и добавить все элементы.

//        List <String> list1 = new ArrayList<>(Arrays.asList("Hi", "Hi1", "Hi2"));
//        List <String> list2 = new ArrayList<>(Arrays.asList("Hi3", "4", "Hi5"));
//
//        List <String> list3 = new ArrayList<>(list1);
//        list3.addAll(list2);
//        System.out.println(list3);

        //Форматированный вывод чисел
        // Вывести числа с 2 знаками после запятой.
        // Использовать String.format или DecimalFormat.
        // Учитывать локализацию и округление.
        // Не округляют или округляют вручную.

//        double number1 = 5.6789;
//        System.out.printf("%.3f", number1);0
        System.out.println(generateRandomNumber(1, 26));
    }

    // Содержит элемент	Проверить, есть ли элемент в массиве.

    public static boolean ifArrayContainsElement (int [] arr, int element){
        for (int i=0;i<arr.length;i++){
            if(arr[i]==element){
                return true;
            }
        }
        return false;
    }

    // Разворот строки	Вернуть строку в обратном порядке.

    public static String reverseString(String str){
        char [] arr = str.toCharArray();
        char [] reversed = new char[arr.length];
        for (int i =0; i<arr.length; i++){
            reversed[i] = arr[arr.length-1-i];
        }
        return new String(reversed);
    }

    // Разворот массива	Перевернуть массив в обратном порядке.

    public static int [] reverseArray(int[] arr){
        int [] result = new int [arr.length];
        for (int i =0; i<arr.length; i++){
            result[i] = arr[arr.length-1-i];
        }
        return result;
    }

    // Сумма чисел в строке	Найти сумму всех чисел, встречающихся в строке.	Проход по символам, аккумулирование чисел.
    public int sumNumbers(String str) {
        int sum = 0, num = 0;
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0'); }
            else { sum += num;
                num = 0;}
        }
        return sum + num;
    }

    // Объединить отсортированные массивы
    // Объединить два отсортированных массива в один отсортированный.
    // [1,5,10]
    // [2,7,12]

    public static int [] sortedArray( int [] arr1, int [] arr2){
        int [] arr3 = new int[arr1.length+arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            arr3[k++] = arr1[i] < arr2[j] ? arr1[i++] : arr2[j++];
        }

        while (i < arr1.length) {
            arr3[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            arr3[k++] = arr2[j++];
        }
        return arr3;
    }


    //Проверка палиндрома
    // Проверить, является ли строка палиндромом (одинаково читается в обе стороны).
    // Сравнить строку с её реверсированной копией.
    // Нужно обрабатывать пробелы, регистр, null.

    public static boolean ifStringPalindrom(String str){
        if (str == null){
            return false;
        }
        char [] chars = str.toLowerCase().replaceAll("\\s+", "").toCharArray();
        for( int i = 0; i<chars.length/2; i++){
            if(chars[i] !=chars[chars.length-i-1]){
                return false;
            }
        }
        return true;
    }

    //Сумма чисел массива	Посчитать сумму всех чисел в массиве.
    // Пройтись циклом по массиву и накопить сумму.
    // Проверить на null и пустой массив.

    public static int arrayNumbersSum(int [] array){
        if (array.length ==0 || array == null){
            throw new RuntimeException("Array length or array is null");
        }
        int sum = 0;
        for (int i =0; i<array.length; i++){
            sum+=array[i];
        }
        return sum;
    }

    //Поиск максимального числа	Найти наибольшее число в массиве.
    // Инициализировать максимум первым элементом и сравнивать с остальными.
    // Нужно проверить входные данные.
    public static int arrayMaxNumber(int [] array){
        if (array.length ==0 || array == null){
            throw new RuntimeException("Array length or array is null");
        }
        int maxNumber = array[0];
        for (int i =0; i<array.length; i++){
            if (array[i]>maxNumber){
                maxNumber = array[i];
            }
        }
        return maxNumber;
    }

    //Проверка на простое число
    // Определить, является ли число простым (делится только на 1 и себя).
    // Проверить делимость от 2 до sqrt(n).	0 и 1 не являются простыми числами.
    // 7
    public static boolean ifNumberIsSimple(int number){
        for (int i = 2; i*i<=number; i++){
            if (number%i==0){
                return false;
            }
        }
        return true;
    }

    //Факториал числа
    // Вычислить факториал числа n (n!).
    // Использовать цикл от 1 до n, перемножая все значения.
    // n должно быть ≥ 0.

    public static int factorial (int number){
        int factorial = 1;
        for (int i= 1; i<=number;i++){
            factorial*=i;
        }
        return factorial;
    }

    // Подсчёт гласных
    // Посчитать количество гласных букв в строке.
    // Пройти по строке и проверять каждый символ.
    // Нужно привести строку к нижнему регистру.
    // Не учитывают регистр, пробелы, символы.

    public static int countVowels(String string){
        char[] chars = {'a','e','i','o','u'};
        int countVowels = 0;
        char [] letters = string.replaceAll("\\s+", "").toLowerCase().toCharArray();
        for (int i = 0; i<letters.length; i++){
            for (int j = 0; j < chars.length; j++){
                if(letters[i]==chars[j]){
                    countVowels++;
                }
            }
        }
        return countVowels;
    }

    //Поиск второго максимального элемента
    // Найти второй по величине элемент в массиве.
    // Поддерживать два значения: максимум и второй максимум.
    // Нужны разные значения.
    // Возвращают тот же элемент, не учитывают дубликаты.
    // 5,6,7,7,32,45, 31
    public static Integer findSecondMaxNumber(int [] array){
        Integer maxNumber = array[0];
        Integer secondMax =  null;
        for (int i = 0; i<array.length; i++){
            if (array[i]>maxNumber){
                secondMax = maxNumber;
                maxNumber = array[i];
            } else if (array[i] != maxNumber && (secondMax == null || array[i] > secondMax)) {
                secondMax = array[i];
            }
        }
        return secondMax;
    }

    //Проверка анаграммы
    // Проверить, являются ли две строки анаграммами друг друга.
    // Отсортировать символы строк и сравнить.
    // Привести к нижнему регистру, убрать пробелы.
    // moma ammo

    public static boolean ifAnagrams(String string1, String string2){
        char[] chars1 = string1.toLowerCase().replaceAll("\\s", "").toCharArray();
        char[] chars2 = string2.toLowerCase().replaceAll("\\s", "").toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        return Arrays.equals(chars1, chars2);
    }

    //Подсчёт слов в строке
    // Посчитать количество слов в строке.
    // Разбить строку по пробелам и посчитать длину массива.
    // Удалить лишние пробелы по краям.
    // Не обрабатывают пустую строку, null.

    public static int countWordsInSentence(String sentence){
        if (sentence == null || sentence.isEmpty()){
            throw new RuntimeException("Sentence is null or empty");
        }
        String [] words = sentence.trim().split("\\s");
        return words.length;
    }

    // Сумма значений в списке
    // Посчитать сумму всех чисел в List<Integer>.
    // Итерировать список и суммировать значения.
    // Проверка на null.
    // Путают типы, забывают про null.

    public static int sumOfIntsInList(List<Integer> list){
        if (list == null){
            throw new RuntimeException("List is null");
        }
        return list.stream().reduce(0, Integer::sum);
    }


    //Проверка уникальности элементов
    // Проверить, все ли элементы в массиве уникальны.
    // Использовать Set для проверки повторов.
    // Set не допускает дубликатов.

    public static boolean checkIfArrayIsUnique(String[] list){
        if (list == null){
            throw new RuntimeException("List is null");
        }
        HashSet<Integer> unique = new HashSet<>();
        for (int i =0; i<list.length; i++){
            unique.add(list[i].toLowerCase().hashCode());

        }
        return unique.size() == list.length;
    }


    //Обработка деления на 0
    // Написать метод деления с обработкой исключения деления на ноль.
    // try-catch блок и возврат по умолчанию.	Обработка исключения обязательно.
    // Нет try-catch или ловят Exception.

    public static double deviSionToZero(int number1, int number2){
        if (number2==0){
            throw new ArithmeticException("Cannot divide by zero");
        } else {
            return number1/number2;
        }
    }
    //Фильтрация списка строк по префиксу
    // Оставить только строки, начинающиеся с 'A'.
    // Использовать Stream API с filter.
    // Null и пробелы могут мешать.

    public static List<String> filteredList(List <String> words){
        return words.stream().filter(element -> element.toUpperCase().startsWith("H")).collect(Collectors.toList());
    }

    // Удаление дубликатов из списка
    // Удалить дубликаты из List<Integer>.
    // Сконвертировать в Set и обратно в List.
    // Порядок не сохранится в HashSet.	Не возвращают список, теряют порядок.

    public static List<Integer> removeDublicates(List<Integer> list){
        return list.stream().distinct().collect(Collectors.toList());
    }


    //Фильтрация нечетных чисел
    // Оставить в списке только нечетные числа.
    // Использовать Stream и filter.
    // Проверка на null.	Путают знак условия, забывают collect.
    public static List<Integer> returnOddNumbers (List<Integer> list){
        return list.stream().filter(element -> element%2!=0).collect(Collectors.toList());
    }

    //Проверка наличия элемента в списке
    // Проверить, содержит ли список заданное число.
    // Использовать list.contains(x).
    // Работает с equals.	Путают equals и ==.

    public static boolean ifListContainsNumber (List <Integer> list, int number){
        return list.contains(number);

    }

    //Проверка корректности скобочной последовательности
    // Проверить, сбалансированы ли круглые скобки в строке.
    // Использовать стек для отслеживания открывающих и закрывающих скобок.
    // Нельзя закрыть до открытия.
    // Не обнуляют счетчик, не проверяют конец.
    // (())
    public static boolean isBalanced(String s) {
        int balance = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                balance++;
            } else if (s.charAt(i) == ')') {
                balance--;
            }
            if (balance < 0) return false;
        }
        return balance == 0;
    }

    //Проверка, является ли строка числом
    // Проверить, можно ли строку безопасно преобразовать в число.
    // Использовать Integer.parseInt с try-catch.
    // Обработка исключения обязательна.
    // Ловят Exception, а не NumberFormatException.

    public static boolean ifStringNumber (String string){
        try{
            Integer.parseInt(string);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }

    // Слияние двух списков
    // Объединить два списка в один.
    // Создать новый список и добавить все элементы.
    // Создать новый список, а не менять входные.
    // Изменяют оригинальные списки.

    public static List<Integer> combineTwoLists( List<Integer> list1, List<Integer> list2){
        List <Integer> newList = new ArrayList(list1);
        newList.addAll(list1);
        return newList;
    }


    //Простое перечисление дней недели (enum)	Создать enum Day с 7 днями недели.	Объявить enum с фиксированными значениями.
    // Enum нельзя расширять.
    // Используют enum как String, пишут с ошибками.

    enum days {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY,
    }


    //Поиск частоты слов в строке
    // Подсчитать, сколько раз каждое слово встречается в строке.
    // Разбить строку и использовать Map<String, Integer>.
    // Понижение регистра, разделение по пробелам.
    // Не учитывают регистр, пустые слова.

    public static Map<String, Integer> countWordsInSentnce (String sentence){
        String [] words = sentence.toLowerCase().split("\\s+");
        Map<String, Integer> map = new HashMap<>();

        for (int i =0; i<words.length; i++){
            map.put(words[i], map.getOrDefault(words[i], 0) + 1);
        }
        return map;
    }



    //Сортировка по длине строки
    // Отсортировать список строк по длине слов.
    // Использовать sort с компаратором.
    // Использовать method reference.
    // Путают с лексикографической сортировкой.


    public static List<String> sortedByLength(List<String> list){
        list.sort(Comparator.comparingInt(str->str.length()));
        return list;
    }

    public static int generateRandomNumber(int min, int max){
      int random = (int) (Math.random()*(max - min +1)+min);
      return  random;
    }

    // Поиск частоты слов в строке
    // Подсчитать, сколько раз каждое слово встречается в строке.
    // Разбить строку и использовать Map<String, Integer>.

    public static Map<String,Integer> countWordsInSentence2(String sentence){
        Map<String,Integer> map = new HashMap<>();
        String [] words = sentence.toLowerCase().split("\\s+");
        for (int i =0; i<words.length; i++){
            map.put(words[i], map.getOrDefault(words[i], 0) + 1);
        }
        return map;
    }

    // Подсчёт уникальных символов
    // Найти количество уникальных символов в строке.
    // Использовать Set<Character>.
    public static int countUniqueSymbols(String string){
        char [] chars = string.toLowerCase().replaceAll("\\s+", "").toCharArray();
        Set<Character> set = new HashSet<>();

        for (int i =0; i<chars.length; i++){
            set.add(chars[i]);
        }
        return set.size();
    }

    //Сумма двух чисел
    // Найти два числа в массиве, сумма которых равна target, и вернуть их индексы.
    // Использовать HashMap для хранения индексов.
    // [4,5,6,7,8] // 10

   public static int [] findTwoNumbersToGetTargetSum( int [] numbers, int target){
        Map<Integer, Integer> map = new HashMap<>();

        for(int i =0; i<numbers.length; i++){
            int addition = target - numbers[i];
            if (map.containsKey(addition)){
                return new int[]{map.get(addition), i};
            } else {
                map.put(numbers[i], i);
            }
        }
       return new int [0];
   }
}
