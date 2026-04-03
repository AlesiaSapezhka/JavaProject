package PreparationsForInterview.Static_Final_AM;

public class IdGenerator {
    //  Реализуй класс, который предоставляет уникальные числовые идентификаторы.
    // Объекты этого класса не создаются — он предоставляет метод, возвращающий следующее доступное число.
    // Пояснение: нужно организовать статическое поведение и скрыть возможность создания экземпляров.
    private static int id = 0;
    private IdGenerator() {}
    public static int createId(){
        id++;
        return id;
    };
}
