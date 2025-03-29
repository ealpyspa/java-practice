package practice_5_oop.task1_transport;

public class Ship  extends Transport {
    public Ship() {
        super(4, 5000);
    }

    @Override
    public void start() {
        System.out.println("Корабль поплыл.");
    }
}
