package practice_5_oop.task1_transport;

public abstract class Transport {
    private double speed; // км/ч
    private int capacity; // м^3

    public Transport(double speed, int capacity) {
        this.speed = speed;
        this.capacity = capacity;
    }

    public double getSpeed() {
        return this.speed;
    }

    public int getCapacity() {
        return this.capacity;
    }

    abstract void start();

}
