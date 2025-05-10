package hw5_6_oop_principles.task3_restaurant;

public abstract class Dish {
    private String name;

    public Dish(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void add();

    public abstract void print();
}
