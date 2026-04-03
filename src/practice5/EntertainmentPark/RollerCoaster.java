package practice5.EntertainmentPark;

public class RollerCoaster extends Attraction{
    @Override
    void maintain() {
        System.out.print("Американсикм горкам необходима проверка безопасности.");
    }

    @Override
    void info(){
        System.out.println("Острые ощущения.");
    }
}
