package hw1_first_program;

public class SixthTask {
    public static void main(String[] args) {
        System.out.println(averageSpeed(180, 3));
        System.out.println(averageSpeed(10.5, 2));

    }

    public static double averageSpeed(double distance, double time) {
        return distance / time;
    }
}
