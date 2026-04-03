package practice5.See;

public class Main {
    public static void main(String[] args) {

        SeaAnimals shark = new Shark();
        SeaAnimals seeStar = new SeaStar();
        SeaManager manager = new SeaManager();

        manager.printInfo(shark);
        manager.printInfo(seeStar);
    }
}
