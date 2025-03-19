package oop.labor02.lab2_3;

public class Main {
    public static void main(String[] args) {
        System.out.println(DateUtil.isValidDate(2000,2, 29));
        System.out.println(DateUtil.isValidDate(2000,2, 30));
        System.out.println(DateUtil.isValidDate(1900,2, 29));
        System.out.println(DateUtil.isValidDate(1900,2, 28) );
        System.out.println(DateUtil.isValidDate(-1900,2, 28));
        System.out.println(DateUtil.isValidDate(0,2, 28) );
        System.out.println(DateUtil.isValidDate(2021,2, 29) );
        System.out.println(DateUtil.isValidDate(2020,2, 29) );
        System.out.println(DateUtil.isValidDate(2020,1, 32) );
        System.out.println(DateUtil.isValidDate(2020,1, 0) );
        System.out.println(DateUtil.isValidDate(2020,0, 0) );
        System.out.println(DateUtil.isValidDate(2020,4, 31) );
        System.out.println(DateUtil.isValidDate(2020,1, 31));
        System.out.println(DateUtil.isValidDate(2005,12,10));
        System.out.println(DateUtil.IsLeapYear(2000));
        System.out.println(DateUtil.IsLeapYear(2001));
        System.out.println(DateUtil.IsLeapYear(1900));
        System.out.println(DateUtil.IsLeapYear(1900));
        System.out.println(DateUtil.IsLeapYear(-1900));
        System.out.println(DateUtil.IsLeapYear(0));
        System.out.println(DateUtil.IsLeapYear(2021));
        System.out.println(DateUtil.IsLeapYear(2020));
        System.out.println(DateUtil.IsLeapYear(2020));
        System.out.println(DateUtil.IsLeapYear(2020));
        System.out.println(DateUtil.IsLeapYear(2020));
        System.out.println(DateUtil.IsLeapYear(2020));
        System.out.println(DateUtil.IsLeapYear(2020));
        System.out.println(DateUtil.IsLeapYear(2005));
    }
}
