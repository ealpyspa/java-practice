package hw5_6_oop_principles.task3_restaurant;

public class Main {
    public static void main(String[] args) {
        Dish hotGish = new HotDish("Хинкали", 40);
        Dish juice = new Beverage("Апельсиновый сок", 330);

        Manager manager = new Manager();

        manager.addItemToMenu(hotGish);
        manager.printDishDetails(hotGish);

        manager.addItemToMenu(juice);
        manager.printDishDetails(juice);
    }
}
