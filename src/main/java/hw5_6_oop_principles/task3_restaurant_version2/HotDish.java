package hw5_6_oop_principles.task3_restaurant_version2;

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
    public void print() {
        super.print();
        System.out.println("Tемпература блюда: " + getTemperature());
    }
}
