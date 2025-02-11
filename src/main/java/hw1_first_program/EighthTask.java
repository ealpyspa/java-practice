package hw1_first_program;

public class EighthTask {
    public static void main(String[] args) {
        System.out.println(circleCircumference(3));
        System.out.println(circleCircumference(4.25));
    }

    public static double circleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }
}
