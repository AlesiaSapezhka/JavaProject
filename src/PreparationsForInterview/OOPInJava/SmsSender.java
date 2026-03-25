package PreparationsForInterview.OOPInJava;

public class SmsSender implements NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("Message was sent by telephone" + " " + message);
    }
}
