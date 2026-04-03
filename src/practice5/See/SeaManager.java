package practice5.See;

public class SeaManager {

    SeaAnimals seaAnimals;

    void setSeaAnimals(SeaAnimals seeAnimals) {
        this.seaAnimals = seaAnimals;
    }

   void printInfo(SeaAnimals seaAnimals){
       seaAnimals.swim();
    }
}
