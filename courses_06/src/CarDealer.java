import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CarDealer {
    private String name;
    private ArrayList<Car> cars =new ArrayList<>();
    private String filename;

    public CarDealer(String name) {
        this.name = name;
    }
    public void addCar(Car car){
        cars.add(car);
    }
    public void addFromFile(String filename){
        try(Scanner scanner = new Scanner(new File(filename))){
            //SIKERES MEGNYITAS ESETEN
            while (scanner.hasNextLine()){
                String line= scanner.nextLine();
                //System.out.println(line);
                String[] words = line.split(",");
                int year=Integer.parseInt(words[2].trim());
                FuelType fuelType=FuelType.valueOf(words[3].trim());
                Car car = new Car(words[0].trim(),words[1].trim(),year,fuelType);
                this.cars.add(car);
            }
        }catch(FileNotFoundException e){
            //SIKERTELEN FILENYITAS ESTEN
            e.printStackTrace();
        }
    }
    public void printCars(){
        for(Car car: cars){
            System.out.println(car);
        }
    }
    public void printCars(FuelType fuelType){
        for(Car car: cars){
            if(car.getFuelType()==fuelType){
                System.out.println(cars);
            }
        }
    }
}
