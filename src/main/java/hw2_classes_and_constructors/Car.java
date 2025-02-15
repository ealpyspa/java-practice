package hw2_classes_and_constructors;

public class Car {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2014);

        car.setYear(2015);
        car.print();
    }

    private String brand;
    private int year;

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void print() {
        System.out.println("Марка: " + brand + ", Год выпуска: " + year);
    }

}
