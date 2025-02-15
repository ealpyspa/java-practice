package hw4_conditional_operators;

import java.util.Scanner;

public class DoWhileTasks {
    public static void main(String[] args) {
        requestNumber();
        requestPassword();
        printNumbers();
    }

    public static void requestNumber() {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.println("Введите число: ");
            n = scanner.nextInt();
        } while (n <= 0);
        System.out.println("Введенное число является положительным.");
    }

    public static void requestPassword() {

        final String INITIAL_PASSWORD = "ABC123";

        Scanner scanner = new Scanner(System.in);
        String passsword;
        do {
            System.out.println("Введите пароль: ");
            passsword = scanner.nextLine();
        } while (!(passsword.equals(INITIAL_PASSWORD)));
        System.out.println("Введен корректный пароль.");
    }

    public static void printNumbers() {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }
}
