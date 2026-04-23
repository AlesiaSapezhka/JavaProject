package clean_code;

class EmailSender extends NotificationSendler {

    @Override
    public void sendNotification(String message) {
        System.out.println("Отправка email: " + message);

    }
}