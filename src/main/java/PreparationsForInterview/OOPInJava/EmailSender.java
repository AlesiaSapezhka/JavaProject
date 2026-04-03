package PreparationsForInterview.OOPInJava;

public class EmailSender implements NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("Message were send by email" + " " + message);
    }
}
