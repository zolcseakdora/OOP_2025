package oop.labor04.lab4_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        readCustomers("lab4_2_input.csv",customers);
        for (Customer customer:customers){
            System.out.println(customer);
        }
    }
    public static void readCustomers(String file, ArrayList<Customer> customers){
        try(Scanner scanner = new Scanner(new File(file))){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(",");
                if(items[0].trim().equals("Account")){
                    String accountNumber = items[1].trim();
                    double money = Double.parseDouble(items[2].trim());
                    Customer customer = customers.getLast();
                    BankAccount account = new BankAccount(accountNumber);
                    account.deposit(money);
                    customer.addAccount(account);
                    continue;
                }
                String firstName= items[1].trim();
                String lastName= items[2].trim();
                Customer customer = new Customer(firstName,lastName);
                customers.add(customer);
            }
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
