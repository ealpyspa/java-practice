package hw2_classes_and_constructors;

public class Rectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 3);

        rectangle.setWidth(8);
        System.out.println(rectangle.calculateArea());
    }

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int calculateArea() {
        return width * height;
    }
}
