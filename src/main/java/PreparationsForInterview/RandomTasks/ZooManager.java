package PreparationsForInterview.RandomTasks;

import java.util.List;

public class ZooManager {
    public Zoo zoo;

    public void feedAll(List<Zoo> animals){
        for(Zoo zoo : animals){
            zoo.takeFood();
        }
    }

    public void addAnimal(List<Zoo> animals, Zoo animalToAdd){
        animals.add(animalToAdd);
    }

}
