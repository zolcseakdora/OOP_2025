package oop.labor02.lab2_1;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("OTP1");
        BankAccount account2 = new BankAccount(": OTP00002");
        System.out.println("initial state:"+ account1);
        System.out.println("initial state:"+ account2);
        account1.deposit(1000);
        account2.deposit(2000);
        System.out.println("After deposit 1000: " + account1);
        System.out.println("After deposit 2000: " + account2);
        //boolean result = account1.withdraw(500);
        if(account1.withdraw(1500)){
            System.out.println("After withdraw 1500: " + account1);
        }
        else{
            System.out.println("After withdraw 1500: " + "Insufficient funds -- "+account1);
        }
        if(account2.withdraw(1500)){
            System.out.println("After withdraw 1500: " + account2);
        }
        else{
            System.out.println("After withdraw 2500: " + "Insufficient funds -- "+account2);
        }

    }
}
