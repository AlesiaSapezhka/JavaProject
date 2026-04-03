package PreparationsForInterview.Static_Final_AM;

public class Order {
    //  Создай класс Order, каждый объект которого при создании автоматически получает уникальный числовой идентификатор (например, 1, 2, 3, ...).
    // ID должен быть доступен только для чтения и не изменяться после присвоения.
    // Класс должен хранить и увеличивать счётчик самостоятельно.
    // Пояснение: реализуй механизм автогенерации значения, доступного каждому объекту, но основанного на общей для класса информации.

    private static int orderCount;
    private final int id;

    public Order(){
        orderCount++;
        this.id=orderCount;
    }

    public int getId() {
        return this.id;
    }
}
