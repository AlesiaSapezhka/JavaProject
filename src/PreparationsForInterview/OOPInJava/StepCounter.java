package PreparationsForInterview.OOPInJava;

public class StepCounter extends Counter{
    private int step;
    public StepCounter(int step) {
        this.step = step;
    }

    @Override
    public int counter(){
        number+=step;
        return number;
    }
}
