package PreparationsForInterview.Static_Final_AM;

public class UserProfile {
    // Создай класс UserProfile, в котором имя доступно публично, а паспортный номер скрыт от других классов.
    // Паспорт можно установить один раз при создании и далее только прочитать изнутри.
    // Пояснение: поработай с модификаторами доступа, геттерами и финальными полями.

    public String name;
    private final int passportId;

    public UserProfile (String name, int passportId) {
        this.name = name;
        this.passportId = passportId;
    }

    private int getPassportId(){
        return passportId;
    }
}
