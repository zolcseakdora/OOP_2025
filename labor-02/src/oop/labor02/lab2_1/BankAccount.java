package oop.labor02.lab2_1;

public class BankAccount {
    private String accountNumber;
    private double balance;

    //ez a konstruktor
    public BankAccount(String pAccountNumber) {
        accountNumber = pAccountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
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
