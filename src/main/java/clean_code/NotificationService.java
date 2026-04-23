package clean_code;

public class NotificationService {

    private NotificationSendler notificationSender;

    public NotificationService(NotificationSendler notificationSender) {
        this.notificationSender = notificationSender;
    }

    public void sendNotification(String message) {
        notificationSender.sendNotification(message);
    }


}