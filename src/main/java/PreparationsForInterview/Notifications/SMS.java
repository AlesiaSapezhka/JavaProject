package PreparationsForInterview.Notifications;

public class SMS extends Notification{
    private String phoneNUmber;

    public SMS(String receiver, String text, String phoneNUmber) {
        super(receiver, text);
        this.phoneNUmber = phoneNUmber;
    }
    @Override
    public void sendNotification(){
        System.out.println("SMS отправлено на " + phoneNUmber + ". " + getText());
    }
}
