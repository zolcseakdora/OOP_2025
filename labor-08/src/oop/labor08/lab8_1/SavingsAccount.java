package oop.labor08.lab8_1;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount( double interestRate) {
        //super(); // Call to BankAccount constructor
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    public void addInterest(){
        double interest = balance * interestRate;
        balance += interest;
    }
    @Override
    public String toString() {
        return "SavingsAccount{" +
                "interestRate=" + interestRate +
                '}';
    }
}
