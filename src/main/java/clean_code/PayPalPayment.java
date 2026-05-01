package clean_code;

public class PayPalPayment extends Payment{
    public PayPalPayment(double amount) {
        super(amount);
    }

    public void pay(double amount){
        System.out.println("Оплата через PayPal на сумму " +amount);
    }
}