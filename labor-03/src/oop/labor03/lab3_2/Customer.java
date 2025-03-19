package oop.labor03.lab3_2;

import oop.labor03.lab3_1.BankAccount;

public class Customer {
    private String firstName;
    private String lastName;
    //tomb letrehozasa dinamikus helyfoglalasssal
    private BankAccount[] accounts = new BankAccount[MAX_ACCOUNTS];
    //konstans
    public static final int MAX_ACCOUNTS = 10;
    //number of account
    private int numAccounts;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void addAccount(BankAccount account) {
        if (numAccounts >= MAX_ACCOUNTS) {
            return;
        }
        //bekoti a tombe a beerkezo accountot
        accounts[numAccounts] = account;
        numAccounts++;
    }

    public BankAccount getAccount(String accountNumber) {
        for (int i = 0; i < numAccounts; i++) {
            //equals = stringet hasonlit stringgel
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                return accounts[i];
            }
        }
        return null;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void closeAccount() {
        accounts = null;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append(firstName + ' ' + lastName + " accounts:\n");
        for(int i=0; i<numAccounts; ++i){
            result.append( "\t" + accounts[i] +"\n");
        }
        return result.toString();
    }
}
