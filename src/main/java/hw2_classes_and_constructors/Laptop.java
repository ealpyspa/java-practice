package hw2_classes_and_constructors;

public class Laptop {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Lenovo", 70000.0);

        laptop.setPrice(85000.0);
        laptop.printInfo();
    }
    String brand;
    double price;

    Laptop(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    String getBrand() {
        return brand;
    }

    double getPrice() {
        return price;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    void setPrice(double price) {
        this.price = price;
    }

    void printInfo() {
        System.out.println("Ноутбук: " + brand + ", Цена: " + price + " руб.");
    }
}
