package oop.labor03.lab3_2;

import oop.labor03.lab3_1.BankAccount;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Zolcseak", "Dora");
        System.out.println(customer1);
        customer1.addAccount(new BankAccount("BT1"));
        customer1.addAccount(new BankAccount("BT2"));
        System.out.println(customer1);
        customer1.getAccount("BT1").deposit(100);
        System.out.println(customer1);


    }
}
