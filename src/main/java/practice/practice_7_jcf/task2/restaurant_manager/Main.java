package practice_7_jcf.task2.restaurant_manager;

public class Main {
    public static void main(String[] args) {
        RestaurantManager manager = new RestaurantManager();
        manager.addOrder("French fries");
        manager.addOrder("Spaghetti");
        manager.addOrder("Juice");
        manager.addOrder("Pizza");

        manager.deleteOrder("Spaghetti");
        manager.printOrders();
    }
}
