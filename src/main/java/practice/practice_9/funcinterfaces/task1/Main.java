package practice.practice_9.task1;

public class Main {
    public static void main(String[] args) {
        practice.practice_9.task1.MathOperations add = (x, y) -> x + y;
        practice.practice_9.task1.MathOperations subtract = (x, y) -> x - y;
        practice.practice_9.task1.MathOperations multiply = (x, y) -> x * y;
        practice.practice_9.task1.MathOperations divide = (x, y) -> x / y;

        System.out.println(add.apply(2, 3));
        System.out.println(subtract.apply(10, 7));
        System.out.println(multiply.apply(8, 3));
        System.out.println(divide.apply(15, 5));
    }
}
