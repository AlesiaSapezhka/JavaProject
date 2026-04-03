package practice6.linkedHashMap;

import java.util.LinkedHashMap;

public class Tasks {
//    Задача 1:
//    Создайте LinkedHashMap и добавьте в него 5 элементов. Выведите их в порядке добавления.
      LinkedHashMap<String,Integer> contacts = new LinkedHashMap<>();
      public void addContact(String name, int number){
          contacts.put(name,number);
      }
      public void printAllContacts(){
          contacts.forEach((k,v)->{
              System.out.println("Name: " + k + " Number:" + v);
          });
      }
//    Задача 2:
//    Реализуйте телефонную книгу с LinkedHashMap. Добавьте и найдите контакт.
      public void findContact(String name){
            if (contacts.containsKey(name)) {
                System.out.println("Name: " + name + " Number:" + contacts.get(name));
            } else {
                System.out.println("Contact is not found");
            }
      }
}

