package PreparationsForInterview.Notifications;

import java.util.List;

public class NotificationService {

    public void sendNotification(List<Notification> notifications){
        for (Notification notification : notifications){
            notification.sendNotification();
        }
    }
}
