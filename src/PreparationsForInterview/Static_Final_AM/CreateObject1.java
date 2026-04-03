package PreparationsForInterview.Static_Final_AM;

public class CreateObject1 {
    //  Создай класс, у которого нельзя вызвать new извне.
    // Создание объекта должно происходить только через специальный метод create(), который возвращает готовый экземпляр.
    // Пояснение: реализуй паттерн, при котором конструктор недоступен внешнему коду.

    private CreateObject1(){
    }
    public static CreateObject1 createObject(){
        return new CreateObject1();
    }
}
