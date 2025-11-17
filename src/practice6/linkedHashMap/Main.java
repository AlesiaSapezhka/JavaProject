package practice6.linkedHashMap;

public class Main {
    public static void main(String[] args) {
//        Задача 1:
//        Создайте LinkedHashMap и добавьте в него 5 элементов. Выведите их в порядке добавления.
          Tasks tasks = new Tasks();
          tasks.addContact("Alice", 456578);
          tasks.addContact("Alex", 456798);
          tasks.addContact("Ivan", 896578);
          tasks.addContact("Maria", 196578);
          tasks.addContact("Anna", 436578);
          tasks.printAllContacts();
//        Задача 2:
//        Реализуйте телефонную книгу с LinkedHashMap. Добавьте и найдите контакт.
          tasks.findContact("Maria1");
    }
}
