package clean_code;

public abstract class Payment {
    private String paymentType;
    private double amount;


    public Payment(String paymentType, double amount) {
        this.paymentType = paymentType;
        this.amount = amount;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public double getAmount() {
        return amount;
    }

    public abstract void pay(double amount);
}
