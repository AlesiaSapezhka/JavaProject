package clean_code;

public class Worker implements Workable {

    @Override
    public void work() {
        System.out.println("Программист пишет код");
    }
}
