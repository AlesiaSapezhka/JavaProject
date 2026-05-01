package clean_code;

public class NotificationService {

    private NotificationSender notificationSender;

    public NotificationService(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }

    public void sendNotification(String message) {
        notificationSender.sendNotification(message);
    }


}