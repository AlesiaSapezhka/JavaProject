package Patterns.singelton;

public class ConfigurationManager {
    // Параметры подключения к базе данных (например, URL базы данных, имя пользователя, пароль).
    // Путь к папке для хранения файлов.
    // Настройки логирования (например, уровень логирования, путь к лог-файлу).
    private String databaseURL;
    private String username;
    private String password;
    private String host;
    private String port;
    private String filePath;
    private String logLevel;
    private String logFilePath;

    // Единственный экземпляр менеджера
    private static ConfigurationManager configurationManager;

    // Нельзя вызывать конструктор повторно. Сразу инициализируем значения менеджера
    private ConfigurationManager(){
        this.databaseURL = "jdbc:mysql://localhost:3306/mydb";
        this.username = "root";
        this.password = "1234";
        this.host = "localhost";
        this.port = "3306";
        this.filePath = System.getProperty("user.dir");
        this.logLevel = "INFO";
        this.logFilePath = System.getProperty("user.dir");
    };

    // Создание единственного экземпляра
    public static synchronized ConfigurationManager getInstance(){
        if (configurationManager == null){
            configurationManager = new ConfigurationManager();
        }
        return configurationManager;
    }

    public String getDatabaseURL() {
        return databaseURL;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getPort() {
        return port;
    }

    public String getHost() {
        return host;
    }
}
