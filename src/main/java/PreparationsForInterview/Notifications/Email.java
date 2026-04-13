package PreparationsForInterview.Notifications;

public class Email extends Notification{

    private String emailAdress;


    public Email (String receiver, String text,String emailAdress) {
        super(receiver, text);
        this.emailAdress = emailAdress;
    }

    @Override
    public void sendNotification(){
       System.out.println("Email отправлен на: "+ emailAdress + ". " +getText());
    }
}
