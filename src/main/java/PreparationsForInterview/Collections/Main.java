package PreparationsForInterview.Collections;

import java.util.*;
public class Main {
    public static void main(String[] args) {




        // 1. Хранение списка книг
        // Пользователь вводит названия книг. Храни все введённые книги и выведи их в порядке добавления.
        List<String> books = new ArrayList<>();
        books.add("Book1");
        books.add("Book2");
        books.add("Book3");
        books.add("Book4");
        System.out.println(books);

        String a1 = "abc";
        String b1 = "abc";
        System.out.println(a1 == b1);
        System.out.println(a1.equals(b1));

        //2. Уникальные города
        // При вводе городов исключай повторы. Порядок не важен.
        Set<String> cities = new HashSet<String>();
        cities.add("Austin");
        cities.add("Berlin");
        cities.add("Chicago");
        cities.add("Berlin");
        System.out.println(cities);

        // 3. Список последних задач
        // Храни только последние 5 задач, над которыми работал пользователь. При добавлении новой старейшая удаляется.
        Deque<String> tasks = new ArrayDeque<>();
        addTask(tasks, "Task1");
        addTask(tasks, "Task2");
        addTask(tasks, "Task3");
        addTask(tasks, "Task4");
        addTask(tasks, "Task5");
        addTask(tasks, "Task6");
        System.out.println(tasks);

        //4. Соответствие имён и возрастов
        // Храни пары имя-возраст и обеспечь возможность быстро находить возраст по имени.
        Map<String, Integer> namesAndAge = new HashMap<>();
        namesAndAge.put("Anna", 18);
        namesAndAge.put("Denis", 20);
        namesAndAge.forEach((s, age) -> System.out.println(s + " " + age));

        //5. Список гостей без повторов, но с сохранением порядка
        // Вводятся имена гостей. Нужно сохранить только уникальные, но в порядке добавления.
        Set<String> guestsNames = new LinkedHashSet<>();
        guestsNames.add("Denis");
        guestsNames.add("Karl");
        guestsNames.add("Karl");
        System.out.println(guestsNames);
        getSymbols("hellopp HellOOPPO");

        //7. Очередь печати
        // Документы попадают в очередь на печать. Обрабатывай их в порядке поступления.
        Deque<String> work = new ArrayDeque<>();
        work.offer("1");
        work.offer("2");
        work.offer("3");
        work.forEach(System.out::println);
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        getIndex(numbers, 2);

        // 9. Удаление дубликатов из списка чисел
        // Вводится список чисел. Удали повторы и выведи результат.
        Integer[] numbersArray = {6, 8, 9, 8, 4, 9, 3};
        HashSet<Integer> numbersArrayList = new HashSet<>(Arrays.asList(numbersArray));
        System.out.println(numbersArrayList);

        //10. Список задач с приоритетами
        // Храни задачи с приоритетами. Выводи сначала наиболее важные.
        PriorityQueue<Map.Entry<String, Integer>> tasks1 = new PriorityQueue<>((a, b) -> b.getValue().compareTo(a.getValue()));
        tasks1.add(Map.entry("Fix bug1", 3));
        tasks1.add(Map.entry("Fix bug2", 10));
        tasks1.add(Map.entry("Fix bug3", 1));
        tasks1.add(Map.entry("Fix bug4", 6));
        while (!tasks1.isEmpty()) {
            System.out.println(tasks1.poll());
        }
        //14. Обратная сортировка строк
        // Пользователь вводит строки. Сохрани их отсортированными по убыванию.
        TreeSet<String> strings = new TreeSet<>(Comparator.reverseOrder());
        strings.add("one");
        strings.add("two");
        strings.add("three");
        strings.add("four");
        System.out.println(strings);

        //11. Группировка студентов по курсам
        // У каждого студента есть курс (1, 2, 3…). Нужно сгруппировать студентов по курсам.
        HashMap <Integer, List<String>> students = new HashMap<>();
        addStudent(students, "anna", 1);
        addStudent(students, "denis", 2);
        addStudent(students, "karl", 3);
        addStudent(students, "karl", 1);
        System.out.println(students);

        //12. Словарь синонимов
        // Храни слова и список их синонимов. Обеспечь быстрый доступ по слову.
        HashMap<String, List<String>> sinonimus = new HashMap<>();
        addSinonimus(sinonimus, "big", "large");
        addSinonimus(sinonimus, "big", "huge");
        addSinonimus(sinonimus, "small", "tiny");
        addSinonimus(sinonimus, "small", "smallest");
        System.out.println(sinonimus);

        //13. Топ-3 самых частых слова в тексте
        // Подсчитай частоту слов и выведи три самых частых.
        String text = "java is great java is powerful java";
        HashMap<String, Integer> wordsCount = new HashMap<>();
        String[] words = text.split(" ");
        for (String word : words) {
            if (!wordsCount.containsKey(word)) {
                wordsCount.put(word, 1 );
            } else {
                wordsCount.put(word, wordsCount.get(word) + 1);
            }
        }
        System.out.println(wordsCount);


        List<Map.Entry<String, Integer>> list = new ArrayList<>(wordsCount.entrySet());
        list.sort((a,b) ->b.getValue() - a.getValue());
        for (int i= 0; i<=2 && i< list.size(); i++ ){
            System.out.println(list.get(i));
        }
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));


        // 15. Множество товаров без повторений
        // Товары нельзя повторять в списке. Необходимо обеспечить проверку на дубликаты.
        Set<String> goods = new HashSet<>();
        goods.add("one");
        goods.add("two");
        goods.add("one");
        System.out.println(goods);

        //16. Карта цен на продукты
        // Храни название продукта и его цену. Позволяй обновлять цену и получать её по имени.
        Map<String, Integer> products = new HashMap<>();
        products.put("milk", 2);
        products.put("cola", 3);
        products.put("pineapple", 4);
        products.put("pineapple", 5);
        System.out.println("Pineapple costs " + products.get("pineapple") + " dollars");
        System.out.println(products);

        //17. Сортировка студентов по алфавиту
        // Вводится список студентов. Отсортируй по имени.

        List<String> studentsNames = new ArrayList<>();
        studentsNames.add("Anna");
        studentsNames.add("Denis");
        studentsNames.add("Karl");
        studentsNames.add("Alice");
        studentsNames.sort((a,b) -> a.compareTo(b));
        System.out.println(studentsNames);







        //21. Пересечение двух списков
        // Найди общие элементы между двумя списками чисел.
        //22. Уникальные символы в нескольких строках
        // Вводится несколько строк. Найди символы, которые встречаются только в одной строке.
        //23. Объединение нескольких множеств
        // Собери все элементы из нескольких Set и выведи итоговое множество.
        //24. Поддержка истории посещений с возможностью "вперёд/назад"
        // Создай структуру, где можно переходить вперёд и назад между страницами.
        //25. Подсчёт количества пользователей на каждую дату
        // Храни даты и количество входов пользователей на них. Обновляй счётчик по мере поступления данных.
        //26. Очистка коллекции по условию
        // Удаляй из списка все элементы, не удовлетворяющие заданному условию.
        //27. Поддержка упорядоченных категорий и подкатегорий
        // Храни категории и внутри них подкатегории. Все — в порядке алфавита.
        //28. Отображение частоты кликов по ссылкам
        // Пользователь кликает по ссылке. Увеличивай счётчик для этой ссылки.
        //29. Проверка на анаграммы
        // Даны два слова. Определи, являются ли они анаграммами, используя коллекции.

        //18. Дни недели и задачи на них
        // Храни задачи, распределённые по дням недели. Выведи все задачи понедельника.
        Map<String, List<String>> duties = new HashMap<>();
        addTask(duties," Monday", "Task1");
        addTask(duties," Monday", "Task2");
        addTask(duties,"monday", "Task3");
        System.out.println(duties);

        //19. Соответствие пользователей и ролей
        // Каждому пользователю назначена одна или несколько ролей. Поддержи отображение ролей по имени пользователя.

        Map<String,List<String>> userRoles = new HashMap<>();
        addRole(userRoles, "admin", "Alex");
        addRole(userRoles, "USER", "Alex");
        addRole(userRoles, "user", "Petr");
        System.out.println(userRoles);

        //20. Поиск и замена значений в списке
        // Введи список значений. Замени все вхождения определённого элемента на новый.
        LinkedList<Integer> randomNumbers = new LinkedList<>();
        randomNumbers.add(1);
        randomNumbers.add(2);
        randomNumbers.add(3);
        randomNumbers.add(2);
        randomNumbers.add(3);

       replaceNum(randomNumbers);
       System.out.println(randomNumbers);
       randomNumbers.replaceAll(num -> num.equals(3)?1446:num);
       System.out.println(randomNumbers);
     }

     static void replaceNum(LinkedList list){
         for (int i =0; i<list.size(); i++){
             if (list.get(i).equals(2)) {
                 list.set(i, 56);
             }
         }
    }

     static void addRole(Map<String, List<String>> roles, String role, String name) {
        if(! roles.containsKey(name)){
            roles.put(name, new ArrayList<>());
        }
        roles.get(name).add(role);
     }

    static void addTask(Map<String, List<String>> tasks, String day, String task) {
        String normalizedDay = day.toLowerCase().trim();

        if( !tasks.containsKey(normalizedDay)){
            tasks.put((normalizedDay), new ArrayList<>());
        }
        tasks.get(normalizedDay).add(task);
    }

    static void addSinonimus(Map<String, List<String>> list, String word, String sinonimym){
        if (!list.containsKey(word)){
            list.put(word, new ArrayList<>());
        }
        list.get(word).add(sinonimym);
    }

    static void addStudent(Map<Integer, List<String>> students, String name, int course){
        if(!students.containsKey(course)){
            students.put(course, new ArrayList<>());
        }
        students.get(course).add(name);

    }

    static void addTask(Deque<String> tasks, String task) {
        if (tasks.size()==5){
            tasks.removeFirst();
        }
        tasks.addLast(task);
    }

    //6. Частота символов в строке
    // Пользователь вводит строку. Подсчитай, сколько раз встречается каждый символ.
    // символ ключ + кол-во значение
    public static void getSymbols(String word){
        Map <Character, Integer> pairs = new HashMap<>();
        word=word.toLowerCase().trim();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (pairs.containsKey(c)) {
                pairs.put(c, pairs.get(c) + 1);
            } else if (c == ' ') {
                continue;
            }
            else pairs.put(c,1);
        }
        System.out.println(pairs);
    }
    //8. Проверка на наличие элемента
    // Пользователь вводит значение. Нужно определить, есть ли оно в коллекции, и вывести индекс (если применимо).

    public static void getIndex(List<Integer> list, Integer number){
        for(int i=0; i<list.size(); i++){
            if (number.equals(list.get(i))){
                System.out.println(i);
                return;
            }
        }
        System.out.println("Index not found");
    }
}
