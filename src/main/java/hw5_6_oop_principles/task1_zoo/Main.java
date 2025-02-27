package hw5_6_oop_principles.task1_zoo;

public class Main {
    public static void main(String[] args) {
        Animal elephant = new Elephant();
        Animal bird = new Bird();

        Operator operator = new Operator();

        operator.operate(elephant);
        operator.demonstrateSound(elephant);
        operator.demonstrateMove(elephant);

        operator.operate(bird);
        operator.demonstrateSound(bird);
        operator.demonstrateMove(bird);

    }
}
