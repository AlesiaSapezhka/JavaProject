package PreparationsForInterview.Static_Final_AM;

public class ObjectsCreation {
    //  Реализуй класс, который не позволяет создавать объекты напрямую через new.
    // Вместо этого, должен быть специальный метод create() или getInstance(), через который объект создаётся и возвращается.
    // Пояснение: примени паттерн фабрики или одиночки с приватным конструктором.
    private ObjectsCreation() {}

    public static ObjectsCreation create(){
        return new ObjectsCreation();
    }
}
