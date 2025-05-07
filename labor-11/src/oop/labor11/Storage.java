package oop.labor11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Storage {
    ArrayList<Product> products= new ArrayList<>();
    public Storage (String filename){
        try(Scanner scanner=new Scanner(new File(filename))){
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) continue;
                String [] data=line.split(" ");
                products.add(new Product(Integer.parseInt(data[0].trim()),data[1].trim(),Integer.parseInt(data[2].trim()),Integer.parseInt(data[3].trim())));
            }
            Collections.sort(products);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
    public int update(String filename){
        int count=0;
        try (Scanner scanner = new Scanner(new File(filename))) {
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();
            if (line.isEmpty()) continue;
            String[] data = line.split("\\s+");
            int id = Integer.parseInt(data[0]);
            int newAmount = Integer.parseInt(data[1]);
            Product key = new Product(id, "", 0, 0);
            int index = Collections.binarySearch(products, key);

            if (index >= 0) {
                products.get(index).increaseAmount(newAmount);
                count++;
            }
        }
        }catch(FileNotFoundException e){
            return 0;
        }
        return count;
    }

}
