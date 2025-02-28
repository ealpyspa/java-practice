package hw5_6_oop_principles.task3_restaurant;

import practice_5_oop.task2_shop.Printable;

public class Manager {

    public void addItemToMenu(Dish dish) {
        dish.add();
    }

    public void printDishDetails(Dish dish) {
        dish.print();
    }
}
