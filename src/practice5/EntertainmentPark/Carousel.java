package practice5.EntertainmentPark;

public class Carousel extends Attraction{
    @Override
    void maintain() {
        System.out.print("Карусели необходимо тех обслуживание.");
    }

    @Override
    void info(){
        System.out.println("Спокойный аттракцион.");
    }
}
