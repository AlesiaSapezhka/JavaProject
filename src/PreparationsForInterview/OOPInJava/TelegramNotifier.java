package PreparationsForInterview.OOPInJava;

public class TelegramNotifier implements Notifier {
    @Override
    public void notify(User user, String text) {
        System.out.println("Telegram message to " + user.getTelegramId() + ": " + text);
    }
}
