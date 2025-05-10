package hw5_6_oop_principles.task3_restaurant;

public class HotDish extends Dish {
    private double temperature;

    public HotDish(String name, double temperature) {
        super(name);
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    @Override
    public void add() {
        System.out.println("Добавить горячее блюдо в меню.");
    }

    @Override
    public void print() {
        System.out.println("Название блюда: " + getName() + ", температура блюда: " + getTemperature());
    }
}
