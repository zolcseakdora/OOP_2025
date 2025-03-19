package oop.labor04.lab4_1;

public class Person {
    private String fistName;
    private String lastName;
    private int birthYear;

    public Person(String fistName, String lastName, int birthYear) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public String getFistName() {
        return fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fistName='" + fistName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}
