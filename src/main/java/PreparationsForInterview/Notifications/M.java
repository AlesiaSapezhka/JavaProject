package PreparationsForInterview.Notifications;

import java.util.ArrayList;
import java.util.List;

public class M {
    public static void main(String[] args) {

        Notification sms = new SMS("Kolya", "Код подтверждения 1234", "+35766 878 99 09");
        Notification push = new Push("Kolya", "У вас новое сообщение", "computer");
        Notification email = new Email("Kolya", "Ваш заказ готов", "kolya@gmail.com");
        List<Notification> notifications = new ArrayList<>();
        notifications.add(sms);
        notifications.add(push);
        notifications.add(email);

        NotificationService service = new NotificationService();
        service.sendNotification(notifications);
    }
}
