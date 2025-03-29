package practice_5_oop.task1_transport;

public class Plane extends Transport {
    public Plane() {
        super(900, 100);
    }

    @Override
    public void start() {
        System.out.println("Самолет полетел.");
    }
}
