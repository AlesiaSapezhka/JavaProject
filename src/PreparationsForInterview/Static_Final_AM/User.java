package PreparationsForInterview.Static_Final_AM;

public class User {
    // 2. Счётчик пользователей
    // Создай класс User, где каждый пользователь имеет имя.
    // Класс должен вести подсчёт общего количества созданных пользователей. Этот счётчик должен автоматически увеличиваться при создании каждого нового объекта.
    // Также добавь возможность вывести общее количество пользователей.
    // Пояснение: реши, как отслеживать общее количество объектов независимо от экземпляров.

    String name;
    static int usersAmount;

    public User(String name) {
        this.name = name;
        usersAmount++;
    }
    public static void printUsers(){
        System.out.println(usersAmount);
    }
}
