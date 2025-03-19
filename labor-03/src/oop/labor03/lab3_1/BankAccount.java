package oop.labor03.lab3_1;

public class BankAccount {
    private String accountNumber;
    private double balance;

    //ez a konstruktor
    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }

    public String toString() {
        return "BankAccount{" + accountNumber + ", " + balance + "}";
    }

}

