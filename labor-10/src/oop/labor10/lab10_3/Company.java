package oop.labor10.lab10_3;

import oop.labor10.lab10_2.MyDate;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Company {
    private String name;
    private ArrayList<Employee> employees = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void hire(Employee employee) {
        employees.add(employee);
    }

    public void hireAll(String filename) {
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();
                if (line.isEmpty()) continue;

                String[] parts = line.split(",");
                String lastName = parts[0];
                String firstName = parts[1];
                double salary = Double.parseDouble(parts[2]);
                int year = Integer.parseInt(parts[3]);
                int month = Integer.parseInt(parts[4]);
                int day = Integer.parseInt(parts[5]);

                MyDate birthDate = new MyDate(year, month, day);

                if (parts.length == 6) {
                    employees.add(new Employee(firstName, lastName, salary, birthDate));
                } else if (parts.length == 7) {
                    String department = parts[6];
                    employees.add(new Manager(firstName, lastName, salary, birthDate, department));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void fire(int ID) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getID() == ID) {
                employees.remove(i);
                System.out.println("Employee with ID " + ID + " was removed.");
                return;
            }
        }
        System.out.println("No employee found with ID " + ID);
    }

    public void printAll(PrintStream out) {
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    public void printManager(PrintStream out) {
        for (Employee e : employees) {
            if (e instanceof Manager) {
                out.println(e);
            }
        }
    }
}
