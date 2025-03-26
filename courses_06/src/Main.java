public class Main {
    public static void main(String[] args) {
        CarDealer dealer = new CarDealer("Peugeot");
        dealer.addFromFile("cars.txt");
        dealer.printCars();
        dealer.printCars(FuelType.DIESEL);
    }
}

