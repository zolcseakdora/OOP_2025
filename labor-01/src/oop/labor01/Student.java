package oop.labor01;

//2. eloadas
public class Student{
    private String firstName;
    private String lastName;
    private double avarage;

    public Student(String pfirstName, String plastName) {
        //Student a constructor
        firstName = pfirstName;
        lastName = plastName;
    }

    public Student(String pfirstName, String plastName, double pavarage) {
        firstName = pfirstName;
        lastName = plastName;
        avarage = pavarage;
    }
    public void printStudent() {
        System.out.println(firstName + " " + lastName + " " + avarage);
    }
}

