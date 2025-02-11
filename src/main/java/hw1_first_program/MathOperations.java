package hw1_first_program;

public class MathOperations {
    public static void main(String[] args) {
        System.out.println(add(5, 3));
        System.out.println(subtract(10, 4));
        System.out.println(multiply(5, 3));
        System.out.println(divide(15, 2));
    }
    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static double divide(int x, int y) {
        return (double) x / y;
    }
}
