package hw1_first_program;

public class SeventhTask {
    public static void main(String[] args) {
        System.out.println(findHypotenuse(3, 4));
        System.out.println(findHypotenuse(2, 3));
    }

    public static double findHypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }
}
