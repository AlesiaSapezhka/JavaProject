package PreparationsForInterview.OOPInJava;

public class LimitedCounter extends Counter{
    private int limit;
    public LimitedCounter(int limit) {
        this.limit = limit;
    }

    @Override
    public int counter(){
      if (number<limit){
          number++;
      }
      return number;
    }
}
