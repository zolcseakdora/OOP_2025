package oop.labor03.lab3_extra.models;

import oop.labor03.lab3_extra.enums.Major;

public class Student {
    private String neptunCode;
    private String firstName;
    private String lastName;
    private Major major;

    public Student(String neptunCode, String firstName, String lastName, Major major) {
        this.neptunCode = neptunCode;
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + neptunCode + ")";
    }

}
