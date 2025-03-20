package oop.labor04.lab4_2;

import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String lastName;
    private ArrayList<BankAccount> accounts=new ArrayList<>();

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }
    public int getNumAccounts() {
        return accounts.size();
    }

    public BankAccount getAccount(String accountNumber){
        for(BankAccount account : accounts){
            if(account.getAccountNumber().equals(accountNumber)) return account;
        }
        return null;
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }
    public void closeAccount (String accountNumber){
        for(BankAccount account : accounts){
            if(account.getAccountNumber().equals(accountNumber)) {
                accounts.remove(account);
                return;
            }
        }
        System.out.println("This account doesn't exist");

    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", accounts=" + accounts +
                '}';
    }
}
