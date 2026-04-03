package PreparationsForInterview.Static_Final_AM;

public class Parametrs {
    //  Нужно реализовать компонент, где хранятся параметры вроде "timeout", "apiUrl" и т. д.
    // Эти параметры могут меняться во время выполнения, но доступны глобально — для всех частей программы.
    // Пояснение: используй статические поля или методы с контролем доступа.

    private static String apiURL;
    private static int timeout;

    public static void setApiURL(String apiURL){
        Parametrs.apiURL = apiURL;
    }
    public static void setTimeout(int timeout){
        Parametrs.timeout = timeout;
    }
    public static String getApiURL(){
        return apiURL;
    }
    public static int getTimeout(){
        return timeout;
    }
}
