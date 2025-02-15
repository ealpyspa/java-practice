package hw2_classes_and_constructors;

public class Product {
    public static void main(String[] args) {
        Product product = new Product("Хлеб", 50.0);

        product.setPrice(80.0);
        product.applyDiscount(20);
        product.printInfo();
    }
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    String getName() {
        return name;
    }

    double getPrice() {
        return price;
    }

    void setPrice(double price) {
        this.price = price;
    }

    void applyDiscount(double discount) {
        price -=price * discount / 100;
    }

    void printInfo() {
        System.out.println("Товар: " + name + ", Цена: " + price);
    }
}
