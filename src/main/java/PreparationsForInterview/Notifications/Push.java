package PreparationsForInterview.Notifications;

public class Push extends Notification{
    private String device;

    public Push(String receiver, String text, String device) {
        super(receiver, text);
        this.device = device;
    }
    @Override
    public void sendNotification(){
        System.out.println("Push отправлено на " + device + ". " +getText());
    }
}
