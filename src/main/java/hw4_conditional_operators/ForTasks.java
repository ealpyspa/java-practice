package hw4_conditional_operators;

import java.util.Scanner;

public class ForTasks {
    public static void main(String[] args) {
        printNumbers();
        calculateBeforeN();
        printMultiplicationTable();
    }

    public static void printNumbers() {

        for(int i = 1; i < 100; i++) {
            if(i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void calculateBeforeN() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");

        int n = scanner.nextInt();

        int sum = 0;

        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Сумма всех числе от 1 до введенного числа равна: " + sum);
    }

    public static void printMultiplicationTable() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");

        int n = scanner.nextInt();

        int result;

        for(int i = 1; i <= 10; i++) {
            result = n * i;
            System.out.println(n + " * " + i + " = " + result);
        }
    }

}
