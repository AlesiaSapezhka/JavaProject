package clean_code;

//3. Нарушение YAGNI (You Ain't Gonna Need It) – ненужный код
    public class User {

    private String name;
    private String email;
    private String phoneNumber;

    public User(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}
//Задача: Удалите неиспользуемые поля и оставьте только необходимые данные.