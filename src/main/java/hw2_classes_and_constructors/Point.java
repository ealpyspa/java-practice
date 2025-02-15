package hw2_classes_and_constructors;

public class Point {
    public static void main(String[] args) {
        Point point = new Point(2, 10);

        point.setX(5);
        point.print();
    }
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void print() {
        System.out.println("Координаты: x = " + x + ", y = " + y);
    }
}
