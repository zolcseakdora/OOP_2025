package oop.labor04.lab4_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static String[] items;

    public static void main(String[] args) {
        readFromTextFile("lab4_1.txt");
        readFromTextFile("lab4_1_input.csv");
    }

    public static void readFromTextFile(String fileName) {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            int lineCounter = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                ++lineCounter;
                System.out.println(lineCounter + "." + line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static ArrayList<Person> readFromCSVFile(String fileName){
        ArrayList<Person> persons = new ArrayList<>();
        try(Scanner scanner= new Scanner(new File(fileName))){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                if(line.isEmpty()) {continue;}
                String[] parts = line.split(",");
                String firstName = items[0].trim();
                String lastName = items[1].trim();
                int birthYear = Integer.parseInt(items[2].trim());
                persons.add(new Person(firstName, lastName, birthYear));
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        return persons;
    }
}
