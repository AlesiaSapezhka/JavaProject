package practice5.Pets;

public class Cat extends Pets implements Playable {
    @Override
    public void play() {
        System.out.println("Кошка играет");
    }

    @Override
    public void eat() {
        System.out.println("Кошка ест влажный корм");
    }
}
