package hw1_first_program;

public class ThirdTask {
    public static void main(String[] args) {
        System.out.println(difference1(-40, -30));
        System.out.println(difference2(-40, -30));
    }

    public static int difference1(int x, int y) {
        return x - y;
    }

    public static int difference2 (int x, int y) {
        return Math.abs(x - y);
    }

}
