package PreparationsForInterview.Static_Final_AM;

public class BD {
    //  Создай класс, содержащий настройки подключения к базе данных (например, хост, порт, имя базы).
    // Эти значения устанавливаются один раз при запуске программы и далее доступны только для чтения.
    // Пояснение: применяй финальные поля и организуй доступ без возможности изменения.

    private final String host;
    private final String port;
    private final String baseName;

    public BD(String host, String port, String baseName) {
        this.host = host;
        this.port = port;
        this.baseName = baseName;
    }

    public String getHost() {
        return host;
    }
    public String getPort() {
        return port;
    }
    public String getBaseName() {
        return baseName;
    }
}
