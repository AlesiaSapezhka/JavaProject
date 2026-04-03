package practice5.Zoo;

public class Bird extends Animal {
    @Override
    void makeSound() {
        System.out.println("Птица чирикает");
    }
    @Override
    void move() {
        System.out.println("Птица летает");
    }
}
