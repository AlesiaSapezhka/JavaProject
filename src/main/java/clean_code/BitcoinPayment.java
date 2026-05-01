package clean_code;

public class BitcoinPayment  extends Payment{
    public  BitcoinPayment (double amount) {
        super(amount);
    }

    public void pay(double amount){
        System.out.println("Оплата Bitcoin на сумму " + amount);
    }
}