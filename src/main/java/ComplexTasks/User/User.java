package ComplexTasks.User;

public class User {
    // User: Класс пользователя с атрибутами для имени, возраста и электронной почты.
    private String userName;
    private int userAge;
    private String userEmail;

    public User(String userName, int userAge, String userEmail) {
        this.userName = userName;
        this.userAge = userAge;
        this.userEmail = userEmail;
    }

    public String getUserName() {
        return userName;
    }

    public int getUserAge() {
        return userAge;
    }

    public String getUserEmail() {
        return userEmail;
    }
}
