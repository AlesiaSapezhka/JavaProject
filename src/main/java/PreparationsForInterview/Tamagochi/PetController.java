package PreparationsForInterview.Tamagochi;

import java.util.List;

public class PetController {

    public void sendPetToEat (List<Pet> list){
        System.out.println("Pets went to eat: ");
        for (Pet pet : list){
            pet.eat();
        }
    }

    public void sendPetToSleep (List<Pet> list){
        System.out.println("Pets went to sleep: ");
        for (Pet pet : list){
            pet.sleep();
        }
    }
}
