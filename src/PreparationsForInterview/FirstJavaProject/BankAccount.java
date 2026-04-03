package PreparationsForInterview.FirstJavaProject;

public class BankAccount {

    double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }
    public double deposit(double amount) {
        return this.balance + amount;
    }

    public double withdraw(double amount) {
        double balanceAmount = 0;
        if (balance >= amount) {
            balanceAmount = this.balance - amount;
        }
        return balanceAmount;
    }
}
