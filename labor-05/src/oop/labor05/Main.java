package oop.labor05;

import oop.labor02.lab2_3.MyDate;
import oop.labor05.models.Course;
import oop.labor05.models.Student;
import oop.labor05.models.Training;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Course> courses = readCourses("courses.csv");
        for (Course course : courses) {
            System.out.println(course);
        }
        ArrayList<Student> students = readStudents("students.csv");
        for (Student student : students) {
            System.out.println(student);
        }
        ArrayList<Course> courses2 = loadCourses();
        ArrayList<Student> students2 = loadStudents();
        ArrayList<Training> trainings = new ArrayList<>();
        Random rand = new Random();
        for (Course course : courses) {
            Training training = new Training(course, new MyDate(2023, 3, 21), new MyDate(2023, 3, 25), rand.nextInt(1001) + 1000);
            while (training.getStudents().size() < 10) {
                Student randomStudent = students.get(rand.nextInt(students.size()));
                training.enroll(randomStudent);
            }

            trainings.add(training);
            System.out.println(training); // Kiíratás konzolra
            training.printToFile();
        }
    }

    private static ArrayList<Course> readCourses(String fileName) {
        ArrayList<Course> courses = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] array = line.split(",");
                int numHours = Integer.parseInt(array[2].trim());//metódus próbálja ezt a karakterláncot egész számmá (int típusú) konvertálni.
                Course course = new Course(array[0].trim(), array[1].trim(), numHours);//trim leszedi a feher karatereket
                courses.add(course);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return courses;
    }

    private static ArrayList<Student> readStudents(String fileName) {
        ArrayList<Student> students = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] array = line.split(",");
                Student student = new Student(array[0].trim(), array[1].trim(), array[2].trim());
                students.add(student);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return students;
    }

    private static ArrayList<Course> loadCourses() {
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(new Course("JavaSE", "Java Standard Edition", 24));
        courses.add(new Course("PythonBasics", "Python kezdőknek", 20));
        return courses;
    }

    private static ArrayList<Student> loadStudents() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("12345", "Kiss", "Péter"));
        students.add(new Student("67890", "Nagy", "Anna"));
        students.add(new Student("54321", "Tóth", "László"));
        return students;
    }

}

