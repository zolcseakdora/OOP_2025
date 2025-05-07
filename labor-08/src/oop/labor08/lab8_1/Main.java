package oop.labor08.lab8_1;

public class Main {
    public static void main(String[] args) {
               Bank otp = new Bank("OTP");

                Customer c1 = new Customer("Alice","wow");
                Customer c2 = new Customer("Bob","meow");

                BankAccount sa1 = new SavingsAccount( 0.05);
                BankAccount ca1 = new CheckingAccount( 200);
                c1.addAccount(sa1);
                c1.addAccount(ca1);

                BankAccount sa2 = new SavingsAccount( 0.04);
                BankAccount ca2 = new CheckingAccount(300);
                c2.addAccount(sa2);
                c2.addAccount(ca2);

                otp.addCustomer(c1);
                otp.addCustomer(c2);

                System.out.println("Initial state:");
                otp.printCustomersToStdout();

                ((SavingsAccount) sa1).addInterest();
                ((SavingsAccount) sa2).addInterest();

                System.out.println("\nAfter interest:");
                otp.printCustomersToStdout();

                ((CheckingAccount) ca1).withdraw(600);
                ((CheckingAccount) ca2).withdraw(900);

                System.out.println("\nAfter withdrawal:");
                otp.printCustomersToStdout();
            }

        }
