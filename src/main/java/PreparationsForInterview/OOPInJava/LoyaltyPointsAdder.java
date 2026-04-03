package PreparationsForInterview.OOPInJava;

public class LoyaltyPointsAdder implements OrderProcessor {
    double bonus;
    @Override
    public void process(Order order) {
        bonus= order.getAmount()*0.1;
        System.out.println("Bonus is "+bonus);
    }
}
