package practice_7_jcf.task2.restaurant_manager;

import java.util.LinkedList;

public class RestaurantManager {
    private LinkedList<String> orders;
    public RestaurantManager() {
        this.orders = new LinkedList<>();
    }
    // добавлять заказ в конец очереди
    public void addOrder(String order) {
        orders.addLast(order);
    }

    // обрабатывать заказ из начала очереди
    public String getNextOrderForProcess() {
        return orders.poll();
    }

    // удалять заказ в любом месте очереди
    public void deleteOrder(String order) {
        orders.remove(order);
    }

    public void printOrders() {
        System.out.println("All orders:");
        orders.forEach(System.out::println); // instead of this: order -> System.out.println(order)
        System.out.println();
    }


}
