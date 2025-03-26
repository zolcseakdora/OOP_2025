package oop.labor05.point;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Point> points = new ArrayList<>();
        System.out.println("Meret:"+points.size());
        for(int i=0; i<10; ++i){
            points.add(new Point(i,i));
        }
        for(Point point: points){
            System.out.println(point);
        }
        for(Point point: points){
            System.out.println("%.2f\n"+point.distanceFromOrigin());
        }
    }
}
