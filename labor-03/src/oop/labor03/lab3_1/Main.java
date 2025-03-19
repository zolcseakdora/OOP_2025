package oop.labor03.lab3_1;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("John", "Black");
        System.out.println(customer1);
        customer1.setAccount(new BankAccount("BT1"));
        System.out.println(customer1);
        customer1.getAccount().deposit(1000);
        System.out.println(customer1);
        customer1.closeAccount();
        System.out.println(customer1);
        Customer customer2 = new Customer("Marry", "White");
        customer2.setAccount(new BankAccount("OTP00002"));
        System.out.println(customer2);
        customer2.closeAccount();
        System.out.println(customer2);
        customer2.setAccount(customer1.getAccount());
        System.out.println(customer1);
        System.out.println(customer2);
    }
}
