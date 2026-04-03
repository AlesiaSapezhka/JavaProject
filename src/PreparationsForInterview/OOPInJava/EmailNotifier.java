package PreparationsForInterview.OOPInJava;

public class EmailNotifier implements Notifier {
    @Override
    public void notify(User user, String text) {
        System.out.println("Email to " + user.getEmail() + " " + text);
    }
}
