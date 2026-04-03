package PreparationsForInterview.OOPInJava;

public interface Notifier {
   // Создай интерфейс Notifier с методом notify(User user, String text).
    // Реализуй EmailNotifier, TelegramNotifier, AppNotifier.
    // Добавь механизм переключения канала: пользователь может выбрать свой тип оповещения.
    void notify(User user, String text);
}
