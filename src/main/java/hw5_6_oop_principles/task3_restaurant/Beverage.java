package hw5_6_oop_principles.task3_restaurant;

public class Beverage extends Dish {

    private double volume;

    public Beverage(String name, double volume) {
        super(name);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public void add() {
        System.out.println("Добавить напиток в меню.");
    }

    @Override
    public void print() {
        System.out.println("Название блюда: " + getName() + ", объем: " + getVolume());
    }
}
