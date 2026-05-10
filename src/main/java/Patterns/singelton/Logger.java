package Patterns.singelton;

public class Logger {
    // Единственный экземпляр логгера
    private static Logger logger;

    // Нельзя вызывать конструктор
    private Logger(){

    };
    // Создание единственного экземпляра
    public static synchronized Logger getInstance(){
        if(logger == null){
            logger = new Logger();
        }
        return logger;
    }

    public void info(String message) {
        System.out.println("INFO: " + message);
    }

    public void error(String message) {
        System.out.println("ERROR: " + message);
    }

    public void warn(String message) {
        System.out.println("WARN: " + message);
    }
}
