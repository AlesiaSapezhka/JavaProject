package practice5.Zoo;

public class ZooManager {
    private Animal animal;

    public void addAnimal(Animal animal) {
        this.animal = animal;

    }

    public void showAnimalBehaviour(Animal animal) {
        this.animal.makeSound();
        this.animal.move();
    }

    public void removeAnimal(Animal animal) {
        this.animal = null;
    }
}
