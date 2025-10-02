package app;
import app.exceptions.InsufficientFundsException;
import app.exceptions.InvalidAmountException;


public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String ac, double b) {
        accountNumber = ac;
        balance = b;
    }

    public double  getBalance() {
        return this.balance;
    }

    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException();
        } else {
            balance += amount;
        }
    }

    public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException{
        if (amount <= 0) {
            throw new InvalidAmountException();
        } else if (amount > balance) {
            throw new InsufficientFundsException();
        } else {
            balance -= amount;
        }
    }
}
