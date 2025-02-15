package hw4_conditional_operators;

import java.util.Scanner;

public class WhileTasks {
    public static void main(String[] args) {
        calculateFactorialN();
        printEvenNumber();
        printBackOrderNumbers();
    }

    public static void calculateFactorialN() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");

        int n = scanner.nextInt();

        int i = 1;
        int result = 1;

        while(i <= n) {
            result *= i;
            i++;
        }
        System.out.println("Факториал числа " + n + " равен " + result);
    }

    public static void printEvenNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");

        int n = scanner.nextInt();

        int i = 2;

        while(i <= n) {
            System.out.println(i);
            i += 2;
        }
    }

    public static void printBackOrderNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");

        int n = scanner.nextInt();

        while (n > 1) {
            n--;
            System.out.println(n);
        }
    }

}
