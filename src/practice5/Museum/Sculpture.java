package practice5.Museum;

public class Sculpture extends Exponat {
    @Override
    void history(){
        System.out.print("Скульптурный объект.");

    }
    @Override
    void preserve(){
        System.out.println("Скульптура нуждается в реставрации.");
    }
}
