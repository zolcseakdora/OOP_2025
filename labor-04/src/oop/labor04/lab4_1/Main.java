package oop.labor04.lab4_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
}
