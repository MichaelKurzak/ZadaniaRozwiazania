package a_Zadania.a_Dzien_1.c_Metody;

public class Car {

    private String brand = "polonez";
    private String model;
    private double price = 55.5;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return brand + " " + price;
    }
}
