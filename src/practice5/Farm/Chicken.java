package practice5.Farm;

public class Chicken extends DomesticPet{
    @Override
    void giveProduct() {
        System.out.println("Курица даёт яйца");
    }
    @Override
    void neededCare() {
        System.out.println("Курица нуждается в кормушке");
    }

    @Override
    void feed() {
        System.out.println("Курица ест зерно");
    }
}
