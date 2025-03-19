package oop.labor02.eloadas3_gyakorlas;

public class Main {
    public static void main(String[] args) {
        Auto auto1=new Auto("Dacia","Logan",1200);
        Auto auto2 = new Auto("BMW","X6",30000);
        System.out.println(auto1);
        System.out.println(auto2);
        auto1.setPrice(12000);
        System.out.println(auto1);
        auto2.setManufacture("Logan");
        System.out.println(auto2);
        auto1=auto2;
        System.out.println(auto1);

    }
}

