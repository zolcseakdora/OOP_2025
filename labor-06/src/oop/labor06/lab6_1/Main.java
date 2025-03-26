package oop.labor06.lab6_1;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        System.out.println(bankAccount);
        BankAccount bankAccount1 = new BankAccount();
        System.out.println(bankAccount1);
        Bank btBank = new Bank("BT");
        Customer customer1 = new Customer("John", "Doe");
        Customer customer2 = new Customer("Jane", "Smith");
        btBank.addCustomer(customer1);
        btBank.addCustomer(customer2);
        BankAccount account1= new BankAccount();
        BankAccount account2=new BankAccount();
        BankAccount account3= new BankAccount();
        BankAccount account4= new BankAccount();
        customer1.addAccount(account1);
        customer1.addAccount(account2);
        customer2.addAccount(account3);
        customer2.addAccount(account4);
        if(btBank.getCustomer(1)!=null){
            System.out.println("Ügyfél ID 1:\n" +btBank.getCustomer(1));
        }
        Customer c1=btBank.getCustomer(1);
        for(String accountNumber:c1.getAccountNumbers()){
            c1.getAccount(accountNumber).deposit(100);
        }
        System.out.println("Ügyfél ID 2:\n" +btBank.getCustomer(2));
        btBank.printCustomersToFile("bank_customers.csv");
    }
}
