package oop.labor04.lab4_3;

public class Main {
    public static void main(String[] args) {

        MyArray array = new MyArray("data.txt");
        //array.fillRandom();
        array.print();
        array.sort();
        array.print();
        System.out.println("The mean is: " + array.mean());
        System.out.println("The Standard Deviation is: " + array.stddev());
    }
}