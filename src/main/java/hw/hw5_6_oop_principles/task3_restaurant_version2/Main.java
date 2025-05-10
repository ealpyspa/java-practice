package hw5_6_oop_principles.task3_restaurant_version2;

public class Main {
    public static void main(String[] args) {
        hw5_6_oop_principles.task3_restaurant_version2.Dish hotDish = new HotDish("Хинкали", 40);
        Dish juice = new Beverage("Апельсиновый сок", 330);

        hw5_6_oop_principles.task3_restaurant_version2.Manager manager = new Manager();

        manager.addItemToMenu(hotDish);
        manager.printDishDetails(hotDish);

        manager.addItemToMenu(juice);
        manager.printDishDetails(juice);
    }
}
