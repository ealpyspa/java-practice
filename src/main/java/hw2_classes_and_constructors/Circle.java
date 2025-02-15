package hw2_classes_and_constructors;

public class Circle {
    public static void main(String[] args) {
        Circle circle = new Circle(3);

        circle.setRadius(3.10);
        System.out.println("Площадь круга: " + circle.calculateAres() + ", длина окружности: " + circle.calculateCircumference());
    }
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double getRadius() {
        return radius;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    double calculateAres() {
        return Math.PI * radius *radius;
    }

    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}
