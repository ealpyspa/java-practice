package hw5_6_oop_principles.task3_restaurant_version2;

public abstract class Dish implements Printable{
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

    @Override
    public void print() {
        System.out.println("Название блюда: " + getName());
    }
}
