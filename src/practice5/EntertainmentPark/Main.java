package practice5.EntertainmentPark;

public class Main {
    static void main(String[] args) {
        Attraction rollerCoaster = new RollerCoaster();
        Attraction carousel = new Carousel();
        ParkManager parkManager = new ParkManager();

        parkManager.operateAttraction(rollerCoaster);
        parkManager.operateAttraction(carousel);
    }

}
