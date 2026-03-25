package PreparationsForInterview.OOPInJava;

public class BankAccount {
    private double balance;
    // ООП принципы в Java
    //1. Банковский счёт (Инкапсуляция)
    // Создай класс BankAccount, который содержит поле balance. Баланс нельзя устанавливать напрямую.
    // Реализуй методы deposit(double amount) и withdraw(double amount), которые изменяют баланс только при корректных значениях.
    // Также реализуй метод getBalance(), возвращающий текущее значение.

    public void deposit(double amount){
        if(amount>0) {
            balance +=amount;
        }
    }

    public void withdraw(double amount){
        if (balance>0 && balance>amount){
            balance-=amount;
        }
    }

    public double getBalance(){
        return balance;
    }
}
