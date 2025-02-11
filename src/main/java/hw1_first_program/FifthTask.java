package hw1_first_program;

public class FifthTask {
    public static void main(String[] args) {
        System.out.println(convertSecondsToMinutes(80));
        System.out.println(convertSecondsToMinutes(180));
    }

    public static int convertSecondsToMinutes(int seconds) {
        return seconds / 60;
    }

}
