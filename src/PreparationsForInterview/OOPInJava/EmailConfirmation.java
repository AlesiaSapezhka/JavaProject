package PreparationsForInterview.OOPInJava;

public class EmailConfirmation implements OrderProcessor{
    @Override
    public void process(Order order) {
        System.out.println("Email sent to " + order.getEmail());
    }
}
