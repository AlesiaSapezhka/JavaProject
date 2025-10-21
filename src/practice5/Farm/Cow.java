package practice5.Farm;

public class Cow extends DomesticPet{

    @Override
    void giveProduct() {
        System.out.println("Корова даёт молоко");
    }

    @Override
    void neededCare() {
        System.out.println("Корова нуждается в выпасе");
    }
    @Override
    void feed() {
        System.out.println("Корова ест траву");
    }
}
