package practice_5_oop.task1_transport;

public class Car extends Transport {
    public Car() {
        super(70,4);
    }

    @Override
    public void start() {
        System.out.println("Машина поехала.");
    }
}
