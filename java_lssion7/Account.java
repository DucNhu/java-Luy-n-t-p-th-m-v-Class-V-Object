package java_lssion7;

public class Account {
    private int accountNumber;
    private double balance;
    public Account ( int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public Account ( int accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }
    public int getAccountNuber() {
        return this.accountNumber;
    }
    public double getBalance() {
        return this.balance;
    }
    public double setBalance(double balance) {
        return this.balance;
    }
    public void credit(double amount) {
        balance += amount;
    }
    public void debit(double amount) {
        if(balance < amount) {
            System.out.println("Amount withdrawn exceesds the current balance!");
        }
        else {
            balance -= amount;
        }
    }
    public String toString() {
        return String.format("A/C no: %d, BBalance = %.2f",
                accountNumber, balance
        );
    }
}

