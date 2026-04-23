package clean_code;

public class PaymentProcessor {
    public void processPayment(Payment payment) {
        payment.pay(payment.getAmount());
    }
}