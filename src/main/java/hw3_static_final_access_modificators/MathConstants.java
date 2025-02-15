package hw3_static_final_access_modificators;

public class MathConstants {
    public static void main(String[] args) {
        System.out.println(MathConstants.calculateArea(3));
        System.out.println(calculateArea(2.10));

        System.out.println(MathConstants.calculateCircumference(3));
        System.out.println(calculateCircumference(2.10));
    }

    static final double PI = 3.14159;
    final double E = 2.71828;

    static double calculateArea(double radius) {
        return PI * radius * radius;
    }

    static double calculateCircumference(double radius) {
        return 2 * PI * radius;
    }

}
