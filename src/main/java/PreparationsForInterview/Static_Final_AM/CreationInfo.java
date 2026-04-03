package PreparationsForInterview.Static_Final_AM;
import java.time.LocalDateTime;
// Создай объект, который при создании получает текущую дату и время.
// Это значение сохраняется и не должно меняться в дальнейшем.
// Пояснение: реализуй финальное поле и задай его в момент создания.
public class CreationInfo {

    private final String dateOfCreation;

    public CreationInfo() {
        this.dateOfCreation = LocalDateTime.now().toString();
    }

    public String getDateOfCreation() {
        return dateOfCreation;
    }
}

