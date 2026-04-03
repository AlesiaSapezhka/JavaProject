package PreparationsForInterview.Static_Final_AM;

public class ObjectCount {
    //  Создай структуру, которая позволяет создать только ограниченное число экземпляров (например, не больше 3).
    // Если превышен лимит — верни null или сообщение.
    // Пояснение: контролируй количество созданных объектов с помощью общего счётчика.
    static int count = 0;
    private static final int LIMIT = 3;

    private ObjectCount(){
    }
    public static ObjectCount createObjectCount(){
        if (count<LIMIT){
            count++;
            return new ObjectCount();
        }
        return null;
    }
}
