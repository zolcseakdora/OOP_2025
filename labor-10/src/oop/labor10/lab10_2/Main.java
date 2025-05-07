package oop.labor10.lab10_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<MyDate> date = new ArrayList<>();
        Random random = new Random();
        while (date.size()!=10){
        int year=2025;
        int month= random.nextInt(12)+1;
        int day= random.nextInt(31)+1;
        if(DateUtil.isValidDate(year,month,day)){
            date.add(new MyDate(year,month,day));
        }

        }
        Collections.sort(date);
        System.out.println("Rendezett dátumok ");
        for (MyDate dates : date) {
            System.out.println(dates);
        }

        Collections.sort(date, (MyDate d1, MyDate d2) -> {
            return d2.compareTo(d1);
        });

        System.out.println("Rendezett dátumok ");
        for (MyDate dates : date) {
            System.out.println(dates);
        }
    }
}
