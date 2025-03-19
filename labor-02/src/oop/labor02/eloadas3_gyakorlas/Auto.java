package oop.labor02.eloadas3_gyakorlas;


public class Auto {
    private String manufacture;
    private String model;
    private double price;
    public Auto(String manufacture, String model, double price) {
        this.manufacture=manufacture;
        this.model=model;
        this.price=price;
    }
    public void setManufacture(String manufacture) {
        this.manufacture=manufacture;
    }
    public void setModel(String model){
        this.model=model;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public String getManufacture(){
        return manufacture;
    }
    public String getModel(){
        return model;
    }
    public double getPrice(){
        return price;
    }
    public String toString(){
        return manufacture+" "+model+" "+price;
    }

}

