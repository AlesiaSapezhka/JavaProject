package clean_code;

public class PayPalPayment extends Payment{
    public PayPalPayment(String paymentType, double amount) {
        super(paymentType, amount);
    }

    public void pay(double amount){
        System.out.println("Оплата через PayPal на сумму " +amount);
    }
}