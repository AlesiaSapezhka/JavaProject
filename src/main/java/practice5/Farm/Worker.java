package practice5.Farm;

public class Worker {
    DomesticPet domesticPet;

    public void managePets( DomesticPet domesticPet) {
        domesticPet.giveProduct();
        domesticPet.neededCare();
        domesticPet.feed();
    }
}
