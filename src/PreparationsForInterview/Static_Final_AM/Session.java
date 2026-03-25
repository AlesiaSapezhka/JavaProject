package PreparationsForInterview.Static_Final_AM;

public class Session {
    // Создай класс Session, в котором при создании объекта счётчик активных сессий увеличивается, а при вызове метода close() — уменьшается.
    // Количество активных сессий должно быть доступно через отдельный метод.
    // Пояснение: используешь общее поле для отслеживания состояний всех экземпляров.

    private static int sessionsCount;
    public Session(){
        sessionsCount++;
    }
    public void close(){
        sessionsCount--;
    }
    public static int getSessionsCount(){
        return sessionsCount;
    }
}
