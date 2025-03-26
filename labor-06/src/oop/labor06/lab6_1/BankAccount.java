package oop.labor06.lab6_1;

public class BankAccount {
   public static final String PREFIX ="BT";
   public static final int ACCOUNT_NUMBER_LENGTH=10;
   private static int numAccounts;
   private final String accountNumber;
   private double balance;

    public BankAccount() {
        ++numAccounts;
        accountNumber=creatAcoountNumber();
    }
    private static String creatAcoountNumber(){
        return PREFIX+String.format("%08d",numAccounts);
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public void deposit(double amount) {
        if (amount <= 0) return;
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (balance < amount) return false;
        balance -= amount;
        return true;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
