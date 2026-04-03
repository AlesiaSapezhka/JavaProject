package PreparationsForInterview.Static_Final_AM;

public class BankAccount {

    private double balance;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        if (amount>0) {
            balance += amount;
        }
    }
    public void withdraw(double amount){
        if (amount > 0 && balance>=amount){
        balance-=amount;
    }
    }
}
