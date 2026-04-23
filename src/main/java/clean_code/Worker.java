package clean_code;

public class Worker implements Eatable, Workable {
    @Override
    public void eat() {
        throw new UnsupportedOperationException("Программист не ест на работе");
    }

    @Override
    public void work() {
        System.out.println("Программист пишет код");
    }
}
