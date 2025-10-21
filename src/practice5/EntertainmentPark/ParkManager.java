package practice5.EntertainmentPark;

public class ParkManager {
    Attraction attraction;

    public void setAttraction(Attraction attraction) {
        this.attraction = attraction;
    }
    public void operateAttraction(Attraction attraction) {
       attraction.maintain();
       attraction.info();
    }
}
