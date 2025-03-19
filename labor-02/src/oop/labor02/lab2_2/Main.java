package oop.labor02.lab2_2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[10];
        Random rand = new Random();
        for (int i = 0; i < rectangles.length; ++i) {
            int length = 1 + rand.nextInt(10);
            int width = 1 + rand.nextInt(10);
            rectangles[i] = new Rectangle(length, width);
            System.out.println("rectangle{" +
                    "length:" + rectangles[i].getLength() +
                    "width:" + rectangles[i].getWidth() +
                    "area:" + rectangles[i].area() +
                    "perimeter:" + rectangles[i].perimeter() +
                    "} ");
        }
    }
}

