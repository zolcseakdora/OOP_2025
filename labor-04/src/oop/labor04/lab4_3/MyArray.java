package oop.labor04.lab4_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class MyArray {
    private int length;
    private double[] elements;
    public MyArray(int length) {
        this.length = length;
        this.elements = new double[length];
    }
    public MyArray(double inputArray[]) {
        this.length = inputArray.length;
        this.elements = Arrays.copyOf(inputArray, inputArray.length);
    }
    public MyArray(MyArray myArray) {
        this.length = myArray.length;
        this.elements = Arrays.copyOf(myArray.elements,myArray.length);
    }
    public MyArray(String file){
        try(Scanner scanner = new Scanner(new File(file))){
            this.length = scanner.nextInt();
            this.elements = new double[length];
            for (int i = 0; i < length; i++) {
                this.elements[i] = scanner.nextDouble();
            }
        }
        catch (FileNotFoundException e) {
            System.err.println("Error: File not found - " + file);
            this.length = 0;
            this.elements = new double[0];  // Ensure the array is initialized
        }
    }
    public void fillRandom(){
        Random rand = new Random();
        for(int i = 0; i < length; ++i){
            elements[i] = rand.nextDouble();
        }
    }

    public double mean(){
        if (length == 0) {
            throw new ArithmeticException("Cannot calculate mean of an empty array.");
        }
        double sum = 0;
        for(double element : elements){
            sum += element;
        }
        return sum / length;
    }

    public double stddev(){
        double mean = this.mean();
        double dev = 0;
        for (int i = 0; i < length; ++i) {
            dev += pow(elements[i] - mean, 2);
        }

        return sqrt(dev / length);
    }

    public void print(){
        for(double element : elements){
            System.out.printf("%.2f ",element);
        }
        System.out.println();
    }
    public void sort(){
        Arrays.sort(elements);
    }
}
