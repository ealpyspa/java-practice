package practice_5_oop.task1_transport;

public class Main {
    public static void main(String[] args) {
        Transport car = new Car(); //SOLID => L - Барбара Лисков - принцип подстановки (то, что можем заменить родителя на наследника)
        Transport ship = new Ship();
        Transport plane = new Plane();

        Dispatcher dispatcher = new Dispatcher();

        dispatcher.control(car);
        dispatcher.printTransportDetails(car);

        dispatcher.control(ship);
        dispatcher.printTransportDetails(ship);

        dispatcher.control(plane);
        dispatcher.printTransportDetails(plane);
    }
}
