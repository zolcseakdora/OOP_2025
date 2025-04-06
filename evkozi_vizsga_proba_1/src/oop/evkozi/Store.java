package oop.evkozi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    private static ArrayList<Product> products=new ArrayList<>();
    private static ArrayList<Integer> storeID=new ArrayList<>();
    private static ArrayList<Integer> storeCount =new ArrayList<>();

    public  ArrayList<Product> readFromFileProducts(String filename){
        try(Scanner scanner = new Scanner(new File(filename))){
            while(scanner.hasNextLine()) {
                if (scanner.hasNextInt()) {
                    int id = scanner.nextInt();
                    if (scanner.hasNext()) {
                        String name = scanner.next();
                        if (scanner.hasNextDouble()) {
                            double purchasePrice = scanner.nextDouble();
                            if (scanner.hasNextDouble()) {
                                double arres = scanner.nextDouble();
                                products.add(new Product(id, name, purchasePrice, arres));

                            }
                        }
                    }

                }
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        return products;
    }
    public static  int readFromFileStore(String filename){
        int falseIdCount=0;
        try(Scanner scanner = new Scanner(new File(filename))){
            while(scanner.hasNextLine()) {
                int id = scanner.nextInt();
                if (scanner.hasNextInt()) {
                    int count = scanner.nextInt();
                    boolean found = false;
                    for (int i = 0; i < storeID.size(); i++) {
                        if (storeID.get(i) == id) {
                            storeCount.set(i, storeCount.get(i) + count);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        boolean ok = false;
                        for (Product p : products) {
                            if (p.getId() == id) {
                                ok = true;
                                break;
                            }
                        }
                        if (ok) {
                            storeID.add(id);
                            storeCount.add(count);
                        } else {
                            falseIdCount++;
                        }
                    }
                }
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        return falseIdCount;
    }
    public void listProduct(){
        for(Product p:products){
            System.out.println(p);
        }
    }
    public double totalPurchasePrice(){
        double amount=0;
        for (int i = 0; i < storeID.size(); i++) {
            int id=storeID.get(i);
            int count=storeCount.get(i);
            for(Product p:products){
                if(p.getId()==id){
                    amount+=p.getPurchasePrice()*count;
                    break;
                }
            }
        }
        return amount;
    }
}
