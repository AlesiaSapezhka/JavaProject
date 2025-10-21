package practice5.Botanic;

public class Main {
    static void main(String[] args) {

        Plant cactuc = new Cactuc();
        Plant orhid = new Orhid();
        PlantManager manager = new PlantManager();

        manager.care(cactuc);
        manager.care(orhid);
    }
}
