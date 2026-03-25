package PreparationsForInterview.Static_Final_AM;

public class Debug {
    //  Создай логическую переменную debugMode, отражающую, находится ли программа в режиме отладки.
    // Она должна быть доступна в любом месте и изменяема через специальные методы.
    // Пояснение: реализуй статическое поле с контролем доступа.

    private static boolean debugMode;
    public static void setDebugMode(boolean value){
      debugMode = value;
    }
    public static boolean isDebugMode() {
        return debugMode;
    }
}
