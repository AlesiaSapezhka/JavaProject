package PreparationsForInterview.Tamagochi;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pet dog = new Dog("Alex","meat", "budka");
        Pet dog1 = new Dog("Ira", "milk", "bed");
        List<Pet> petsList = new ArrayList<Pet>();
        petsList.add(dog);
        petsList.add(dog1);
        PetController controller = new PetController();
        controller.sendPetToEat(petsList);
        controller.sendPetToSleep(petsList);

    }


}
