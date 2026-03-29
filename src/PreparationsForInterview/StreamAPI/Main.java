package PreparationsForInterview.StreamAPI;

import java.util.*;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // Фильтрация строк по длине
        // Из списка строк выбери только те, чья длина больше 5, используя Predicate и stream().filter().
        List<String> words = Arrays.asList("Hello", "Anna", "World", "kava", "Programming", "bob", "email", "bob");
        List<String> wordsWithLengthMoreThanFive = words.stream().filter(str -> str.length()>5).toList();
        System.out.println(wordsWithLengthMoreThanFive);

        //Преобразование чисел в строки
        // Преобразуй список чисел в список строк с приставкой "Число: " — используй Function.

        List <Integer> numbers = Arrays.asList(1, 5,2, 2,-3, -4, 5);
        List<String> numbersAsString = numbers.stream().
                map(num -> "Number: " +num)
                .toList();
        System.out.println(numbersAsString);

        //Печать всех элементов с Consumer
        // Пройдись по списку и выведи каждый элемент, используя Consumer и forEach().
        List <Object> elements = Arrays.asList("Hi", "jo", 7, 8);
        elements.forEach(System.out::println);

        //Фильтрация по нескольким условиям
        // Оставь только положительные чётные числа. Используй цепочку filter() с несколькими Predicate.

        List <Integer> positiveNumbers = numbers.stream()
                .filter (num -> num>=0)
                .collect(Collectors.toList());

        System.out.println(positiveNumbers);

        //Сортировка по убыванию
        // Отсортируй список строк по убыванию длины, используя Comparator и sorted().

        List <String> sortedList = words.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println(sortedList);


        //Подсчёт чётных чисел
        // Сосчитай количество чётных чисел в списке.
        int countEvenNumbers = numbers.stream()
                .filter(num -> num%2==0)
                .toList().size();
        System.out.println(countEvenNumbers);

        //Получение уникальных элементов
        // Из списка чисел убери повторы и отсортируй результат по возрастанию.
        List <Integer> uniqueSortedNumbers = numbers.stream()
                .distinct()
                .sorted(Comparator.comparingInt(num -> num))
                .toList();
        System.out.println(uniqueSortedNumbers);

        //Нахождение первого подходящего элемента
        // Найди первую строку, начинающуюся на "A". Используй filter().findFirst().

        String firstWordStartedFromA = words.stream()
                .filter(str -> str.startsWith("A"))
                .findFirst()
                .toString();
        System.out.println(firstWordStartedFromA);

        //Сумма всех элементов
        // Сосчитай сумму всех чисел с помощью reduce().
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println(sum);

        //Проверка условия для всех элементов
        // Проверь, что все числа в списке положительные — используй allMatch().

        Boolean ifallNumberaArePositive = numbers.stream()
                .allMatch(num -> num>0);
        System.out.println(ifallNumberaArePositive);

        //Проверка хотя бы одного совпадения
        // Есть ли хотя бы одно слово длиной больше 10 символов?

        Boolean ifHasWorkdLenghtMoreThanTen = words.stream()
                .anyMatch(str -> str.length()>10);
        System.out.println(ifHasWorkdLenghtMoreThanTen);

        // Преобразование объектов в одно поле
        // Из списка User получи список всех их email-адресов через map().

        Map<String,String> users = new HashMap<>();
        users.put("Kolya", "gg@.com");
        users.put("Kolya1", "gg@.com");
        users.put("Alex", "as@.com");
        users.put("Kate", "kate@.com");
        List <String> emails = users.values().stream().toList();
        System.out.println(emails);

        //Создание списка через Supplier
        // Создай список из 5 случайных чисел от 1 до 10, используя Supplier<Integer>.
        Supplier<Integer> randomNumbers = () -> (int)(Math.random()*10)+1;
        List <Integer> list = new ArrayList<Integer>();
        for (int i =1;i<=5;i++){
            list.add(randomNumbers.get());
        }
        System.out.println(list);

        //Сортировка объектов по полю
        // Отсортируй список Product по цене по возрастанию.

        Map<Integer,String> products = new HashMap<>();
        products.put(5, "apple");
        products.put(15, "banana");
        products.put(4, "juice");

        Map<Integer,String> sortedProducts  = products.entrySet().stream()
                        .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(sortedProducts);


        //Группировка по длине строки
        // Группируй строки по их длине с помощью Collectors.groupingBy().
        Map <Integer, List<String>> groupedStrings = words.stream()
                .collect(Collectors.groupingBy(str -> str.length()));
        System.out.println(groupedStrings);

        //Поиск максимального значения
        // Найди максимальное значение в списке чисел через max() и Comparator.
        Optional<Integer> maxNum = numbers.stream()
                .max(Comparator.naturalOrder());

        System.out.println(maxNum);

        //Подсчёт количества вхождений по условию
        // Сколько строк содержат букву "e"?
        int countStringsWithE = words.stream().filter(str -> str.contains("e")).toList().size();
        System.out.println(countStringsWithE);

        //Преобразование в Map
        // Преобразуй список User в Map<id, name>.
        //
        //
        //Объединение строк через Join
        // Объедини строки списка в одну через запятую с помощью Collectors.joining().

        String joinedWords = words.stream()
                .collect(Collectors.joining(", "));
        System.out.println(joinedWords);


        //Частотный анализ слов
        // Подсчитай, сколько раз каждое слово встречается в списке строк. Верни Map<String, Long>.
        Map<String,Long> countOfWords = words.stream().collect(Collectors.groupingBy(str -> str, Collectors.counting()));
        System.out.println(countOfWords);

        //Создание подсписка
        // Оставь только первые 3 элемента, используя limit().

        List <String> firstThreeElements = words.stream()
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(firstThreeElements);

        //Пропуск первых элементов
        // Пропусти первые 2 элемента списка, выведи остальные.

        List <String> skipFirstTwoElements = words.stream()
                .skip(2)
                .collect(Collectors.toList());
        System.out.println(skipFirstTwoElements);

        //Удаление по условию с removeIf
        // Удалить все отрицательные числа из List<Integer> с помощью removeIf().
        List<Integer> numbersList = new ArrayList<>(Arrays.asList(6,7,8,-7,-8,9,0,-5));

        numbersList.removeIf(num -> num<0);
        System.out.println(numbersList);

        //Сортировка по нескольким критериям
        // Сначала по фамилии, потом по имени — Comparator.thenComparing().
        Map<String,String> people = new HashMap<>();
        people.put("Alex", "Ivanov");
        people.put("John", "Doe");
        people.put("Kate", "Doe");

        Map<String,String> sortedPeople = people.entrySet().stream().
                sorted( Map.Entry.<String, String>comparingByValue()
                        .thenComparing(Map.Entry::getKey)
                )
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> a,
                        LinkedHashMap::new
                ));
        System.out.println(sortedPeople);

        //Инициализация списка лямбдами
        // Создай список Supplier<String> и вызови их для генерации строк.

        // Сортировка без учёта регистра
        // Отсортируй строки без учёта регистра.
        List<String> sortedString = words.stream()
                .sorted(Comparator.comparing(String::toLowerCase))
                .toList();
        System.out.println(sortedString);

        //Пропуск повторов по ключу
        // Оставь только уникальные объекты по email, используя distinct() с Comparator.
        Map<String,String> emailsList = new HashMap<>();
        emailsList.put("gg@.com", "John");
        emailsList.put("gg@.com", "Doe");
        emailsList.put("io@.com", "Ivanov");

//        Map<String, String> uniqueEmails = emailsList.entrySet()
//                .stream()
//                .distinct(Comparator.comparing(key->key.getKey()))
//                .toMap();

        //Нахождение среднего значения
        // Вычисли средний возраст пользователей.
        //
        //
        //Проверка пустоты списка через Stream
        // Проверь, содержит ли список только пустые строки.
        //
        //
        //Построение строки с префиксом и постфиксом
        // Собери строку из слов с joining(", ", "[", "]").
        //
        //
        //Удаление строк по шаблону
        // Удалить из списка строки, содержащие только цифры, используя removeIf() и Predicate.
        //
        //
        //Мапа в строку
        // Преобразовать Map<String, Integer> в строку вида ключ=значение через запятую — с использованием entrySet().stream() и Collectors.joining().
        //
        //
        //Выбор максимального по вычисляемому полю
        // Найти строку с наибольшим числом гласных.
        //
        //
        //Чередование фильтра и отображения
        // Фильтровать числа, больше 10, и преобразовать в строки вида "Больше десяти: X".
        //
        //
        //Сортировка по длине и алфавиту
        // Отсортируй строки сначала по длине, затем по алфавиту при равенстве.
        //
        //
        //Суммирование длин всех строк
        // Сосчитай суммарную длину всех строк в списке.
        //
        //
        //Формирование списка квадратов чисел
        // Преобразовать список чисел в список их квадратов.
        //
        //
        //Частичное применение (partial application)
        // Создай Function<String, Predicate<String>>, которая возвращает предикат: строка начинается с заданного префикса.
    }
}
