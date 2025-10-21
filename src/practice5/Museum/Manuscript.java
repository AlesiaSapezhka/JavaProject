package practice5.Museum;

public class Manuscript extends Ecsponat {
    @Override
    void history(){
        System.out.print("Древний текст.");

    }
    @Override
    void preserve(){
        System.out.println("Манускрипт нуждается в контроле влажности.");
    }
}
