package PreparationsForInterview.TelephoneBook;

import java.util.HashMap;

public class TelephoneBook {
    private HashMap<String, String> telephoneBook = new HashMap<>();

    public void addContact(String username, String telephoneNumber) {

        if (username == null || telephoneNumber == null || username.isBlank() || telephoneNumber.isBlank()) {
            throw new IllegalArgumentException("Name and phone must not be empty");
        }
        telephoneBook.put(username, telephoneNumber);
    }

    public void removeContact(String username) {
        if(telephoneBook.containsKey(username)) {
            telephoneBook.remove(username);
        } else {
            System.out.println("Contact " + username + " does not exist");
        }
    }

    public String findContactByName(String username) {
        if (telephoneBook.containsKey(username)) {
            return telephoneBook.get(username);
        } else {
            throw new RuntimeException("Contact " + username + " does not exist");
        }
    }

    public boolean ifContactExists (String username) {
        return telephoneBook.containsKey(username);
    }

   public int countContacts() {
        return telephoneBook.size();
   }
    // "В системе есть телефонная книга.
    //Телефонная книга хранит контакты.
    //У каждого контакта есть:
    //имя
    //номер телефона
    //Нужно реализовать систему, которая может:
    //добавить контакт
    //удалить контакт
    //найти номер по имени
    //проверить, существует ли контакт
    //показать количество контактов
    //
    //Правила:
    //имя контакта уникально
    //если контакт с таким именем уже существует, номер должен обновляться
    //если контакт удален, его нельзя найти
    //
    //Пример:
    //Добавляем контакты:
    //Alex → 12345
    //Maria → 77777
    //
    //Поиск:
    //Alex → 12345
    //
    //Удаляем:
    //Maria
    //
    //Количество контактов:
    //1"
}
