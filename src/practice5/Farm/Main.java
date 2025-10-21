package practice5.Farm;

public class Main {

    static void main(String[] args) {
        DomesticPet cow = new Cow();
        DomesticPet chicken = new Chicken();
        Worker farmWorker = new Worker();

        farmWorker.managePets(cow);
        farmWorker.managePets(chicken);
    }

}
