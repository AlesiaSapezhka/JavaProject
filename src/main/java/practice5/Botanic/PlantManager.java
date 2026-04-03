package practice5.Botanic;

public class PlantManager {

    Plant plant;
    public void setPlant(Plant plant){
        this.plant = plant;
    }
    public void care(Plant plant){
        plant.care();
    }
}
