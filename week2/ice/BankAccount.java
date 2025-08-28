
// This class is for Q9
public class BankAccount {
    private double balance;

    public BankAccount() {
        this.balance = 500;
    }
    
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount > this.balance) {
            return false; 
        }
        this.balance -= amount;
        return true; 
    }

    public boolean transfer(double amount, BankAccount otherAccount) {
        if (amount > this.balance) {
            return false;
        }
        this.balance -= amount;
        otherAccount.deposit(amount);
        return true;
    }
}