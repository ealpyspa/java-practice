package hw5_6_oop_principles.task3_restaurant_version2;

public class Beverage extends Dish{
    private double volume;

    public Beverage(String name, double volume) {
        super(name);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Объем: " + getVolume());
    }
}
