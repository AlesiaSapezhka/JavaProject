package PreparationsForInterview.Static_Final_AM;

public class Application {
    //  Нужно реализовать параметр конфигурации, например "development" или "production", который можно прочитать и изменить из любого класса.
    // Он общий для всей программы, не зависит от объектов.
    // Пояснение: реши, как объявить и организовать такие общие переменные и методы.

    private static String development;
    public static String getDevelopment() {
        return development;
    }

    public static void setDevelopment(String newDevelopment) {
        development = newDevelopment;
    }
}
