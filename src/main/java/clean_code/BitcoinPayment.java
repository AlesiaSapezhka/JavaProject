package clean_code;

public class BitcoinPayment  extends Payment{
    public  BitcoinPayment (String paymentType, double amount) {
        super(paymentType, amount);
    }

    public void pay(double amount){
        System.out.println("Оплата Bitcoin на сумму " + amount);
    }
}