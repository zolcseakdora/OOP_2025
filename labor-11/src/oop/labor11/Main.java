package oop.labor11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for(int i=10; i<=1000000; i*=10){
            String datafile="data"+i+".txt";
            for(int j=10; j<=10000000; j*=10){
                String updatefile="update"+j+".txt";
                if(checkFile(datafile) && checkFile(updatefile)){
                    System.out.println("Datafile: "+datafile+" "+"Updatefile: "+updatefile+" "+"Time: "+doIt(datafile,updatefile));
                }
            }
        }
    }
    private static boolean checkFile(String filename){
        try(Scanner scanner=new Scanner( new File(filename))){
            return true;
        }catch(FileNotFoundException e){
            return false;
        }
    }
    private static long doIt(String datafile, String updatefile ){
        long startMilli=System.currentTimeMillis();
        Storage storage=new Storage(datafile);
        storage.update(updatefile);
        int updatedCount = storage.update(updatefile);
        long stopMilli=System.currentTimeMillis();
        System.out.println("Updated products: " + updatedCount);
        return (stopMilli-startMilli)/1000;

    }
}
