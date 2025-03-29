package hw5_6_oop_principles.task3_restaurant_version2;

public class Manager {
    public void addItemToMenu(Dish dish) {
        System.out.println("Добавить в меню блюдо: " + dish.getName());
    }

    public void printDishDetails(Dish dish) {
        dish.print();
    }
}
