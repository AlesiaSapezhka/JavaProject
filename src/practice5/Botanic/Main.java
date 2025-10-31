package practice5.Botanic;

public class Main {
    public static void main(String[] args) {

        Plant cactuc = new Cactus();
        Plant orhid = new Orchid();
        PlantManager manager = new PlantManager();

        manager.care(cactuc);
        manager.care(orhid);
    }
}
