package hw1_first_program;

public class NinthTask {
    public static void main(String[] args) {
        System.out.println(calculatePercentage(5, 2));
        System.out.println(calculatePercentage(5, 2.5));

    }

    public static double calculatePercentage(double total, double part) {
        return part / total * 100;
    }
}
