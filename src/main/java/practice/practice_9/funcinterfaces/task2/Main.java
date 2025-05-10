package practice.practice_9.task2;

public class Main {
    public static void main(String[] args) {
        Checker isPositive = n -> n > 0;
        isPositive.printIfValid(5);
        isPositive.printIfValid(-3);
    }
}
