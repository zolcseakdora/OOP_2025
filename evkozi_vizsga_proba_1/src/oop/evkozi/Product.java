package oop.evkozi;

public class Product {
    private  int id;
    private String name;
    private double purchasePrice;
    private double consumerPrice;

    public Product(int id, String name, double purchasePrice,double arres) {
        this.id=id;
        this.name = name;
        this.purchasePrice = purchasePrice;
        setArres(arres);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public double getConsumerPrice() {
        return consumerPrice;
    }

    public void setArres(double percent){
        this.consumerPrice=purchasePrice*(1+percent/100);
    }

    @Override
    public String toString() {
        return "oop.evkozi.Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", purchasePrice=" + purchasePrice +
                ", consumerPrice=" + consumerPrice +
                '}';
    }
}
