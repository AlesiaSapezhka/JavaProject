package practice5.Zoo;

public class Main {
    public static void main(String[] args) {
        Animal bird = new Bird();
        Animal elephant = new Elephant();
        ZooManager zooManager = new ZooManager();

        zooManager.addAnimal(bird);
        zooManager.addAnimal(elephant);

        zooManager.showAnimalBehaviour(bird);
        zooManager.showAnimalBehaviour(elephant);
    }
}
