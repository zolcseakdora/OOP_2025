package oop.labor05.models;

import oop.labor02.lab2_3.MyDate;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Training {
    private final Course course;
    private final MyDate startDate;
    private final MyDate endDate;
    private double pricePerStudent;
    private final ArrayList<Student> students = new ArrayList<>();

    public Training(Course course, MyDate startDate, MyDate endDate, double pricePerStudent) {

        this.course = course;
        this.startDate = startDate;
        this.endDate = endDate;
        this.pricePerStudent = pricePerStudent;
    }

    public boolean enroll(Student student) {
        if (!students.contains(student)) {
            students.add(student);
            return true;
        }
        return false;
    }

    public void printToFile() {
        String filename = String.format("%s_%d.%d.%d_%d.%d.%d.csv",
                course.getName(),
                startDate.getYear(), startDate.getMonth(), startDate.getDay(),
                endDate.getYear(), endDate.getMonth(), endDate.getDay());

        try (FileWriter writer = new FileWriter(filename)) {
            for (Student student : students) {
                writer.write(student.toString() + "\n");
            }
        } catch (IOException e) {
            System.err.println("Hiba a fájl írásakor: " + e.getMessage());
        }
    }


    public ArrayList<Student> getStudents() {
        return students;
    }


    @Override
    public String toString() {
        String result = "Training{\n";
        result += "course='" + course + "'\n";
        result += "startDate=year: " + startDate.getYear() + " month: " + startDate.getMonth() + " day: " + startDate.getDay() + "\n";
        result += "endDate=year: " + endDate.getYear() + " month: " + endDate.getMonth() + " day: " + endDate.getDay() + "\n";

        for (Student student : students) {
            result += student + "\n\n";
        }

        result += "}";
        return result;
    }

}

