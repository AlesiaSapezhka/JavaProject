package PreparationsForInterview.Static_Final_AM;

public class Basic {
    //  Реализуй метод shutdown() в базовом классе, который может вызываться в дочерних, но не может быть переопределён.
    // Пояснение: выбери модификатор, запрещающий изменение реализации метода.

    protected final void shutdown(){
        System.out.println("Shutdown");
    }
}
