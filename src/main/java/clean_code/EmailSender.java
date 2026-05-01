package clean_code;

class EmailSender extends NotificationSender {

    @Override
    public void sendNotification(String message) {
        System.out.println("Отправка email: " + message);

    }
}