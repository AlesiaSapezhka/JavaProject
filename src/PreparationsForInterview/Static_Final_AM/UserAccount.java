package PreparationsForInterview.Static_Final_AM;

public class UserAccount {
    //  Создай класс UserAccount, где логин задаётся один раз при создании объекта и далее не меняется.
    // Остальные поля, например имя или email, можно редактировать.
    // Пояснение: ограничь возможность изменения логина после инициализации, но оставь доступ к другим данным.

    final String login;
    String name;
    public UserAccount(String login, String name) {
        this.login = login;
        this.name = name;
    }
}
