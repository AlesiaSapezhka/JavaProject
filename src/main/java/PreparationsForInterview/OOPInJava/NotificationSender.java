package PreparationsForInterview.OOPInJava;

public interface NotificationSender {

    //  Создай интерфейс NotificationSender с методом send(String message).
    // Реализуй три класса: EmailSender, SmsSender, каждый из которых реализует метод отправки по-своему.
    // Создай метод notifyUsers(List<NotificationSender> senders, String msg), который вызывает send() у каждого отправителя.
    public void send(String message);
}
