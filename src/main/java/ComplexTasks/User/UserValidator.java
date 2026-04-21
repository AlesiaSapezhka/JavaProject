package ComplexTasks.User;

public class UserValidator<T extends User> {
    //Управление валидацией: Валидация данных должна происходить только если флаг validationEnabled установлен в true.
    private boolean validationEnabled;

    public void setValidationEnabled(boolean validationEnabled) {
        this.validationEnabled = validationEnabled;
    }

    public void checkAllValues(String name, int age, String email) throws InvalidUserException {
        if (!validationEnabled) {
            return;
        }
        if (!isNameValid(name)) {
            throw new InvalidUserException("Invalid name");
        }
        if (!isAgeValid(age)) {
            throw new InvalidUserException("Invalid age");
        }
        if (!isValidEmail(email)) {
            throw new InvalidUserException("Invalid email");
        }
    }

    // Проверка имени: Имя должно быть не пустым и начинаться с заглавной буквы.
    public boolean isNameValid(String userName) {
        if (userName == null || userName.isEmpty()) {
            return false;
        }

        return Character.isUpperCase(userName.charAt(0));
    }

    //Проверка возраста: Возраст должен быть в пределах от 18 до 100 лет.
    public boolean isAgeValid(int userAge) {
        return (userAge >= 18 && userAge <= 100);
    }

    //Проверка email: Email должен соответствовать стандартному формату электронной почты.
    public boolean isValidEmail(String email) {
        return email != null && email.matches("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$");
    }

    //Исключения: При обнаружении невалидных данных необходимо выбрасывать InvalidUserException.

}
