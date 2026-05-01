package clean_code;

public class CreditCardPayment extends Payment{
    public CreditCardPayment(double amount) {
        super(amount);
    }

    public void pay(double amount){
        System.out.println("Оплата кредитной картой на сумму " + amount);
    }
}
