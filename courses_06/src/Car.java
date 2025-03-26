public class Car {
    private String brand;
    private String model;
    private int year;
    private FuelType fuelType;

    public Car(String brand, String model, int year,FuelType fuelType) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.fuelType=fuelType;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", fuelType=" + fuelType +
                '}';
    }
}
