package PreparationsForInterview.OOPInJava;

public class User {

    private String email;
    private int telegramId;
    private Notifier notifier;

    public User(String email, int telegramId) {
        this.email = email;
        this.telegramId = telegramId;
    }
    public String getEmail() {
        return email;
    }
    public int getTelegramId() {
        return telegramId;
    }

    public void setNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    public void sendNotification(String text) {
        if (notifier != null) {
            notifier.notify(this, text);
        } else {
            System.out.println("No notifier set for ");
        }
    }


}
