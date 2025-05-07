package oop.labor10.lab10_3;

import oop.labor10.lab10_2.MyDate;

public class Employee {
    private  final int ID;
    private String firstName;
    private String lastName;
    private double salary;
    private MyDate birthDate;
    private int counter=0;

    public Employee(String firstName, String lastName, double salary, MyDate birthDate) {
        this.ID = ++counter;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.birthDate = birthDate;
    }

    public int getID() {
        return ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public MyDate getBirthDate() {
        return birthDate;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", name='" + firstName + " " + lastName + '\'' +
                ", salary=" + salary +
                ", birthDate=" + birthDate +
                '}';
    }
}
