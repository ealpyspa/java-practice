package hw1_first_program;

public class FourthTask {
    public static void main(String[] args) {
        System.out.println(squareArea(4));
        System.out.println(squarePerimeter(3));
    }

    public static int squareArea(int side) {
        return side * side;
    }

    public static int squarePerimeter(int side) {
        return 4 * side;
    }
}
