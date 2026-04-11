package PreparationsForInterview.RandomTasks;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Zoo> animals = new ArrayList<>();
        Zoo begemot = new Begemot();
        Zoo jiraf = new Jiraf();
        ZooManager zooManager = new ZooManager();

        zooManager.addAnimal(animals, begemot);
        zooManager.addAnimal(animals, jiraf);
        zooManager.feedAll(animals);

    }
}
