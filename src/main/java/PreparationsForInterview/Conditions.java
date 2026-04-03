package PreparationsForInterview;
import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        System.out.print("Введите число: ");
//        int number = scanner.nextInt();
//        System.out.print("Введите число2: ");
//        int number2 = scanner.nextInt();
//        System.out.print("Введите число3: ");
//        int number3 = scanner.nextInt();
//        Conditions.passwordCheck(number);
System.out.println(Conditions.mediane());
//    Conditions.numbersSkipThird();
    }


    // 1. Определение чётности числа
    // Проверь, является ли введённое число чётным или нечётным. Выведи соответствующее сообщение.
    public static boolean isEven(int number) {
        return number % 2 == 0 ? true : false;
    }

    //2. Проверка возраста на совершеннолетие
    // Вводится возраст. Выведи, совершеннолетний ли пользователь или нет.
    public static boolean isAdult(int number) {
        return number >= 18 ? true : false;
    }

    //3. Минимум из двух чисел
    // Сравни два числа и выведи меньшее из них.
    public static int compareNumbers(int number1, int number2) {
        return number1 > number2 ? number1 : number2;
    }

    //4. Проверка кратности
    // Определи, делится ли введённое число на 3 без остатка.
    public static boolean isDevidesToThree(int number) {
        return number % 3 == 0 ? true : false;
    }

    //5. Оценка по баллам
    // На вход подаётся число от 0 до 100. Выведи оценку по шкале:
    // 90–100 — "Отлично",
    // 75–89 — "Хорошо",
    // 50–74 — "Удовлетворительно",
    // меньше 50 — "Неудовлетворительно".
    public static String marks(int number) {
        if (number >= 90 && number <= 100) {
            return "Отлично";
        } else if (number >= 75 && number <= 89) {
            return "Хорошо";
        } else if (number >= 50 && number <= 74) {
            return "Удовлетворительно";
        } else if (number < 50 && number >= 0) {
            return "Неудовлетворительно";
        } else {
            return "Wrong mark";
        }
    }

    //6. Сравнение трёх чисел
    // Вводятся три числа. Определи наибольшее из них.
    public static int compareNumbers(int number1, int number2, int number3) {
        if (number1 >= number2 && number1 >= number3) {
            return number1;
        } else if (number2 >= number1 && number2 >= number3) {
            return number2;
        } else return number3;
    }

    //7. Чётные числа от 1 до N
    // Выведи все чётные числа от 1 до заданного числа N.
    public static void evenNumbers(int count) {
        for (int i = 1; i <= count; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    //8. Сумма чисел от 1 до 100
    // Посчитай сумму всех чисел от 1 до 100 включительно.
    public static int sum(int count) {
        int sum = 0;
        for (int i = 1; i <= count; i++) {
            sum += i;
        }
        return sum;
    }
    //9. Умножение без оператора *
    // Выполни умножение двух положительных чисел с помощью цикла и сложения.

    public static int multiplication(int a1, int a2) {
        int result = 0;
        for (int i = 0; i < a2; i++) {
            result += a1;
        }
        return result;
    }

    //10. Таблица умножения для числа
    // Пользователь вводит число. Построй таблицу умножения от 1 до 10 для этого числа.
    public static void table(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "*" + i + "=" + i * num);
        }
    }

    //11. Проверка високосного года
    // На вход подаётся год. Определи, является ли он високосным.
    public static boolean isVisocosny(int year) {
        return (year % 400 == 0 && year%100!=0 || year %100 ==0)? true : false;
    }

    //12. Пароль с попытками
    // Реализуй проверку пароля с максимум тремя попытками. После трёх неудач выводится сообщение "Доступ запрещён".
    public static void passwordCheck (){
        Scanner scanner=new Scanner(System.in);
        int correctPassword = 12345;

        for (int i = 0; i<3; i++) {
            System.out.print("Введите число: ");
            int password = scanner.nextInt();
            if (password == correctPassword) {
                System.out.println("Success");
                return;
            } else {
                System.out.println("Wrong password");
            }
        }
    }
    //13. Обратный отсчёт
    // Выведи числа от 10 до 1 в обратном порядке. В конце — "Старт!".
    public static void numbers(){
        for (int i = 10;i>=1; i--){
            System.out.println(i);
        }
        System.out.println("Start");
    }
    // 14. Подсчёт делителей числа
    // Введи число и посчитай, сколько у него натуральных делителей.

    public static void devider(int number){
        for (int i=2; i<=9; i++){
            if (number % i == 0){
                System.out.println(i);
            }
        }
    }

    //15. Факториал числа
    // Вычисли факториал введённого числа n, используя цикл.
    public static int factorial (int number){
        int factorial = 1;
        for (int i = 1; i<=number; i++){
            factorial*=i;
        }
        return factorial;
    }

    //16. Поиск первого делителя
    // Введи число и найди его первый делитель, отличный от 1.
    public static int firstDevider (int number){
        int firstDevider = 1;
        for (int i = 2; i<=5; i++){
            if (number % i == 0){
                firstDevider= i;
                break;
            }
        }
        return firstDevider;
    }
    //17. Проверка на простое число
    // Проверь, является ли число простым.

    public static boolean isSimple (int number){
            return (number%2==0 || number%3==0)?false:true;
    }

    //18. Найти сумму цифр числа
    // Введи целое число. Посчитай сумму всех его цифр.

    public static int sumOfNumbers(){
        Scanner scanner=new Scanner(System.in);
        int sum = 0;
        System.out.print("Введите число: ");
        int input = Math.abs(scanner.nextInt());
        while(input >0){
            int x = input % 10;
            sum+=x;
            input = input/10;
        }
        return sum;
    }

    //19. Поиск максимального числа в серии
    // Пользователь вводит числа до ввода нуля. Найди максимальное число из всех введённых.
    public static int maxNumber(){
        Scanner scanner=new Scanner(System.in);
        int maxNumber =0;
        int input;
        do {
            System.out.print("Введите число: ");
            input = scanner.nextInt();
            if (input != 0 || input >=maxNumber) {
                maxNumber = input;
            }
        } while (input !=0);
        return maxNumber;
    }

    //20. Кол-во положительных и отрицательных
    // Пользователь вводит 10 чисел. Посчитай, сколько из них положительные, отрицательные и нули.

    public static void countNumCharacters(){
        Scanner scanner = new Scanner(System.in);

        int positiveNum = 0;
        int negativeNum = 0;
        int zero = 0;
        int input;
        for (int i = 1; i <= 9; i++) {
            System.out.print("Введите число: ");
            input = scanner.nextInt();
            if (input == 0) {
                zero++;
            } else if (input <0){
                negativeNum++;
            } else {
                positiveNum++;
            }
        }
        System.out.println("positive = " + positiveNum + "\nnegative = " + negativeNum + "\nzero = " + zero);
    }

    //21. Реверс числа
    // Выведи цифры введённого числа в обратном порядке.

    public static void reverseNumber(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Введите число: ");
        int input = scanner.nextInt();
        while (input !=0){
            int x = input%10;
            input = input/10;
            System.out.print(x);
        }
    }

    //22. Простые числа от 2 до 100
    // Выведи все простые числа от 2 до 100 включительно.

    public static void simpleNumbers(){
        for (int i=2; i<=100; i++ ){
            if (i % 2 != 0 && i%3 !=0 && i%5 !=0){
                System.out.println(i);
            }
        }
    }

    //23. Угадать число
    // Программа случайным образом "задумывает" число от 1 до 100. Пользователь пытается угадать. Программа подсказывает: больше/меньше. Игра продолжается, пока число не угадано.
    public static void randomNum() {
        Scanner scanner = new Scanner(System.in);
        int randomNum = (int) (Math.random() * 100) + 1;
        long input;
        do {
            System.out.print("Введите число: ");
            input = scanner.nextLong();
            if (input < randomNum) {
                System.out.println("Число больше");
            } else if (input > randomNum) {
                System.out.println("Число меньше");
            } else {
                System.out.println("Вы угадали");
            }
        } while (input != randomNum);
    }

    //24. Циклическое меню
    // Реализуй консольное меню с пунктами: "1. Старт", "2. Помощь", "0. Выход". Программа повторно показывает меню после каждой команды, пока пользователь не выберет "0".

    public static void menu(){
        int choice;
        do {
            System.out.println("1. Старт");
            System.out.println("2. Помощь");
            System.out.println("0. Выход");
            System.out.println("Enter your choice: ");

            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Program start");
            } else if (choice == 2) {
                System.out.println("Program help");
            } else if (choice == 0) {
                System.out.println("Program exit");
            } else {
                System.out.println("Wrong choice");
            }
        } while (choice !=0);
    }

    //25. Проверка символа
    // Введи один символ. Определи, является ли он цифрой, буквой или чем-то другим.

    //26. Сумма только нечётных чисел от 1 до N
    // Подсчитай сумму всех нечётных чисел от 1 до заданного N.
    public static int sumOfOddNumbers(int number){
        int sum = 0;
        for (int i = 1; i<=number; i++){
            if (i%2!=0){
                sum+=i;
            }
        }
        return sum;
    }
    //27. Уровень зарплаты по опыту
    // Вводится количество лет опыта.
    // До 1 года — "Junior",
    // 1–3 — "Middle",
    // 4–6 — "Senior",
    // 7 и более — "Lead".
    public static String salary(int years){
        String experience = "some age";
       if (years < 1){
            experience = "Junior";
        } else if (years >=1 && years <=3){
            experience = "Middle";
        } else if (years >=4 && years <=5){
            experience = "Senior";
        } else if (years >=6 && years <=7){
            experience = "Lead";
        }  else if (years <0) {
           experience = "Invalid";
        }
        return experience;
    }

    // 28. Таблица квадратов чисел
    // Выведи таблицу квадратов чисел от 1 до 10.

    public static void squareTable(){
        for (int i = 1; i<=10; i++){
            System.out.println(i +"*" + i + "=" + i*i);
        }
    }

    //29. Вывод чисел в столбик и в строку
    // Выведи числа от 1 до 10: сначала каждое в новой строке, затем — все в одной строке через пробел.
    public static void numbersTable(){
        for (int i = 1; i<=10; i++){
            System.out.println(i);
        }
        for (int i = 1; i<=10; i++){
            System.out.print(i + " ");
        }
    }

    //30. Проверка пароля с досрочным выходом
    // Программа предлагает ввести пароль до 5 раз. Если пользователь вводит "exit" — программа завершается сразу.
    public static void passwordChecker(){
        Scanner scanner = new Scanner(System.in);
        String correctPassword = "12345";
        for (int i = 1; i<=5; i++){
            System.out.print("Введите пароль: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) { // досрочный выход
                System.out.println("Программа завершена досрочно");
                break;
            } else if (input.equals(correctPassword)) { // верный пароль
                System.out.println("Пароль верный! Доступ разрешён");
                break;
            } else { // неверный пароль
                System.out.println("Неверный пароль");
            }

            if (i == 5) {
                System.out.println("Превышено количество попыток. Доступ запрещён");
            }
        }
    }

    //31. Определение сезона по номеру месяца
    // Вводится число от 1 до 12. Определи, к какому времени года относится этот месяц.

    public static void season(int month){
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            default:
                System.out.println("Such month not exists");
                break;
        }
    }

    //32. Мини-калькулятор
    // Вводятся два числа и оператор (+, -, *, /). Выполни соответствующее арифметическое действие.
    public static void calculator(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number1");
        int number1 = scanner.nextInt();
        System.out.println("Enter number1");
        int number2 = scanner.nextInt();
        System.out.println("Enter math operator: +, - , *, /");
        char operator = scanner.next().charAt(0);
        if (operator == '+') {
            System.out.println(number1+number2);
        } else if (operator == '-') {
            System.out.println(number1-number2);
        } else if (operator == '*') {
            System.out.println(number1*number2);
        }  else if (operator == '/') {
            System.out.println(number1/number2);
        } else {
            System.out.println("Wrong operator");
        }
    }

    //33. Сравнение строк
    // Вводятся две строки. Определи, равны ли они, не используя ==.

    public static boolean compareStrings(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first string");
        String first = scanner.nextLine();
        System.out.println("Enter second string");
        String second = scanner.nextLine();
        return first.equalsIgnoreCase(second);
    }

    //34. Поиск максимального и минимального
    // Пользователь вводит 5 чисел. Найди и выведи наибольшее и наименьшее из них.

    public static int biggestNumber(){
        Scanner scanner = new Scanner(System.in);
        int biggestNumber = 0;
        for (int i = 1; i<=5; i++){
            System.out.println("Enter number1");
            int number = scanner.nextInt();
            if (number > biggestNumber){
                biggestNumber = number;
            }
        }
        return biggestNumber;
    }

    //35. Генерация числовой последовательности
    // Пользователь вводит начало, конец и шаг. Выведи все числа в этом диапазоне, включая крайние значения.

    public static void diapason() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int number1 = scanner.nextInt();
        System.out.println("Enter second number");
        int number2 = scanner.nextInt();
        System.out.println("Enter step");
        int step = scanner.nextInt();
        if (number2 < number1 || step == 0) {
            System.out.print("Wrong diapason");
        } else {
            for (int i = number1; i <= number2; i += step) {
                System.out.print(i + " ");
            }
        }
    }

    //36. Пропустить чётные числа
    // Выведи числа от 1 до 20, исключая все чётные.

    public static void odd(){
        for (int i =1; i<20; i++){
            if (i%2!=0){
                System.out.print(i + " ");
            }
        }
    }

    // 37. Переворот строки вручную
    // Вводится строка. Выведи её в обратном порядке, не используя StringBuilder.reverse().
    public static String reverseString(){
           Scanner scanner = new Scanner(System.in);
           System.out.println("Enter first string");
           String string = scanner.nextLine();
           String reversed = "";
           for (int i = string.length()-1; i>=0; i--){
               reversed += string.charAt(i);
           }
           return reversed;
    }

    //38. Поиск первого положительного числа
    // Пользователь вводит числа по одному. Найди и выведи первое положительное.
    public static int findFirstPositiveNumber(){
        Scanner scanner = new Scanner(System.in);
        int input;
        while (true) {
            System.out.println("Enter number");
            input = scanner.nextInt();
            if (input > 0){
                return input;
            }
        }
    }

    //39. Проверка ввода на цифру
    // Пользователь вводит символ. Определи, является ли он одной из цифр от 0 до 9.
    public static boolean isNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter symbol");
        char input = scanner.next().charAt(0);
        return input>= '0' && input <= '9';
    }

    // 40. Угадай пароль из ограниченного списка
    // Есть список допустимых паролей ("admin", "user123", "qwerty"). Пользователь вводит пароль. Разреши доступ, если он есть в списке.
    public static void access (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter password");
        String input = scanner.nextLine();
        if (input.equals("admin") || input.equals("user123") || input.equals("qwerty")) {
            System.out.println("Enter succeed");
        } else {
            System.out.println("Wrong password");
        }

    }
    //41. Найти общее количество цифр в числе
    // Пользователь вводит целое число. Определи, сколько в нём цифр.

    public static int countNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        int count = 0;
        if (number == 0){
            return 1;
        }
        while(number!=0){
            count++;
            number=number/10;
        }
        return count;
    }

    //42. Условный вывод строки
    // Вводится строка и число. Если длина строки больше введённого числа — выведи строку в верхнем регистре. Иначе — в нижнем.

    public static String registr(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name");
        String word = scanner.nextLine();
        System.out.println("Enter number");
        int num = scanner.nextInt();
        if (word.length()>num){
            return word.toUpperCase();
        } else {
            return word.toLowerCase();
        }
    }

    //43. Проверка начальной буквы
    // Вводится строка. Определи, начинается ли она с заглавной буквы.
    public static boolean firstLetter(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name");
        String word = scanner.nextLine();

        return Character.isUpperCase(word.charAt(0));
    }

    //44. Простое ли число Фибоначчи
    // Вводится число. Определи, входит ли оно в последовательность Фибоначчи и является ли простым.


    //45. Поиск второй по величине цифры
    // Вводится число. Найди вторую по величине цифру (не сортируя весь список).

    public static int biggestNum(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        int biggest = 0;
        if(number%10!=0){
            biggest = number/10;
            number = number/10;
        }
        return biggest;
    }

    //46. Цикл с досрочным завершением
    // Выведи числа от 1 до 100, но остановись, если встретишь число, кратное 17.
    public static void listOfNum(){
        for (int i = 1; i<=100; i++){
            if (i%17==0){
                continue;
            }
            System.out.println(i+ " ");
        }
    }

    //47. Сумма до превышения лимита
    // Пользователь вводит числа. Заверши ввод, когда сумма всех чисел превысит 100. После этого выведи итоговую сумму.
    public static int sumOfDigits(){
        int sum =0;
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number");
            int digit = scanner.nextInt();
            sum += digit;
        } while (sum<100);
        System.out.print("total sum");
        return sum;
    }

    //48. Умножение всех нечётных чисел от 1 до 15
    // Посчитай произведение всех нечётных чисел от 1 до 15 включительно.
    public static int multiplicationOddNum(){
        int multi=1;
        for (int i =1; i<=15;i++){
            if (i%2!=0){
                multi*=i;
            }
        }
        return multi;
    }

    //49. Разделение строки на слова
    // Пользователь вводит строку. Раздели её на слова и выведи каждое слово на новой строке.

    public static void word(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word");
        String text = scanner.nextLine();
        String word="";
        for (int i =0; i<text.length();i++){
            if (text.charAt(i)!=' '){
                word+=text.charAt(i);
            } else {
                if (!word.isEmpty()) {
                    System.out.println(word);
                    word = "";
                }
            }
        }
        if (!word.isEmpty()) {
            System.out.println(word);
        }
    }
    //50. Цикл угадывания букв
    // В программе хранится скрытая буква (например, 'g'). Пользователь вводит символы по одному, пока не угадает её. Подскажи: "раньше" или "позже" по алфавиту.

    public static void guessSymbol(){
        Scanner scanner = new Scanner(System.in);
       char mySymbol = 'g';
        char symbol;
        do {
            System.out.println("Enter symbol");
            symbol = scanner.next().charAt(0);
            if (symbol==mySymbol){
                System.out.println("You guessed the symbol");
            } else if (symbol>mySymbol){
                System.out.println("Earlier");
            } else {
                System.out.println("Later");
            }

        } while (symbol != mySymbol);
    }
    //51. Проверка палиндрома (число)
    // Введи целое число. Определи, читается ли оно одинаково слева направо и справа налево.

//    public static boolean isPalindromNum(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter number");
//        int number = scanner.nextInt();
//        int reversedNum;
//        while(number>0){
//            reversedNum += number/10;
//        }
//    }

    //52. Проверка пароля на надёжность
    // Пользователь вводит строку. Проверь, содержит ли она хотя бы одну заглавную букву, одну цифру и минимум 8 символов.

//    public static boolean isSafePassword() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter password");
//        String input = scanner.nextLine();
//        boolean containsNumber;
//        boolean containsUppercase;
//        if (input.length() >= 8) {
//            for (int i = 0; i < input.length(); i++) {
//                if (
//                        input.charAt(i)=) {}
//
//            }
//        }
//    }
    //53. Сравнение среднего и медианы
    // Пользователь вводит 3 числа. Найди среднее арифметическое и медиану. Выведи, что больше
    public static int mediane(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number1");
        int number1 = scanner.nextInt();
        System.out.println("Enter number2");
        int number2 = scanner.nextInt();
        System.out.println("Enter number3");
        int number3 = scanner.nextInt();
        int average = (number1+number2+number3)/3;
        int min = number1;
        int max = number1;
        if (number2 < min) min = number2;
        if (number3 < min) min = number3;

        if (number2 > max) max = number2;
        if (number3 > max) max = number3;
        int mediane = (number1+number2+number3 - min-max);
        return (average>mediane?average:mediane);
    }

//    54. Вывод прямоугольника из символов
//    Вводится ширина, высота и символ. Нарисуй прямоугольник заданного размера, используя вложенные циклы.
//            55. Треугольник Пифагора
//    Проверь, являются ли три введённых числа сторонами прямоугольного треугольника.

//            56. Пропуск каждой третьей итерации
//    Выведи числа от 1 до 30, но пропускай каждую третью (то есть 3, 6, 9 и т.д.).
    public static void numbersSkipThird(){
        for (int i =1; i<=30; i++){
            if(i%3!=0){
                System.out.print(i + " ");
            }
        }
    }

//            57. Сумма чисел до нуля
//    Пользователь вводит числа. Считай их сумму, пока не будет введён 0.
        public static int sumUntilZero(){
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        do {
            System.out.println("Enter number");
            number = scanner.nextInt();
            sum+=number;
        } while (number!=0);
        return sum;
    }
//            58. Секундомер с паузой
//    Симулируй секундомер, который выводит счёт от 1 до 10 с задержкой в 1 секунду между шагами. На 5 секунде выведи "Пауза", но продолжи счёт.
//59. Поиск общих делителей двух чисел
//    Введи два числа. Выведи все общие делители.

//            60. Условное вычисление с оператором switch
//    На вход подаётся команда: "print", "save", "exit" — выполни разные действия в зависимости от команды.

//61. Проверка наличия хотя бы одной гласной
//    Пользователь вводит строку. Определи, содержит ли она хотя бы одну гласную букву.

//            62. Нахождение среднего среди положительных
//    Пользователь вводит 10 чисел. Вычисли среднее значение только среди положительных.
    public static int averageFromPositive(){
        int sum =0;
        for (int i = 0; i<=10;i++){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number");
            int number = scanner.nextInt();
            if (number>0){
                sum+=i;
            }
        }
        return sum;
    }
//            63. Циклический сдвиг цифр числа
//    Введи число. Перемести первую цифру в конец. Например, 1234 → 2341.

//            64. Удаление пробелов в строке
//    Пользователь вводит строку. Выведи ту же строку без пробелов.
    public static String stringWithoutSpace(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word");
        String input = scanner.nextLine();
        String fullPhrase="";
        for (int i = 0; i<input.length(); i++){
            if (input.charAt(i)!=' '){
                fullPhrase += input.charAt(i);
            }
        }
        return fullPhrase;
    }
//            65. Поиск наибольшей цифры в числе
//    Введи число. Найди и выведи самую большую цифру.

    public static int largestInt(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        int largest = 0;
        do{
            int digit = number%10;
            if (digit>largest){
                largest = digit;
            }
            number = number/10;
        } while (number!=0);
        return largest;
    }

//            66. Нахождение общих цифр двух чисел
//    Пользователь вводит два числа. Определи, какие цифры встречаются в обоих числах.
//            67. Проверка, входят ли символы в алфавитный диапазон
//    Введи два символа и проверь, находится ли второй между первым и 'z' по алфавиту.
//            68. Математический тренажёр
//    Генерируй случайные выражения вида a + b. Пользователь должен ввести правильный ответ. После 5 правильных решений — завершить.

//69. Калькулятор степеней
//    Введи основание и степень. Посчитай результат возведения в степень без использования Math.pow().
    public static int degree(int base, int degree){
        int sum=1;
        for (int i = 1; i<=degree; i++){
            sum*=base;
        }
        return sum;
    }

//            70. Поиск повторяющихся цифр в числе
//    Проверь, содержит ли введённое число хотя бы одну повторяющуюся цифру.

}


