package Lessons28;

public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    public void deposit ( double amount){
        if (amount>0){
            balance = balance + amount;

        }
    }
    public void withdraw(double amount){
        if (amount >0 && balance >= amount){
            balance= balance - amount;
        }
    }
}
