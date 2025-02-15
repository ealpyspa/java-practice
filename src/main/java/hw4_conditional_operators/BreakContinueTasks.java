package hw4_conditional_operators;

import java.util.Scanner;

public class BreakContinueTasks {
    public static void main(String[] args) {
        calculateSum();
        printNumbers();
        printSomeNumbers();
    }

    public static void calculateSum() {
        Scanner scanner = new Scanner(System.in);

        int n;
        int sum = 0;

        while(true) {
            System.out.println("Введите число: ");
            n = scanner.nextInt();
            if (n < 0) {
                break;
            }
            sum += n;
        }
        System.out.println(sum);
    }

    public static void printNumbers() {

        for(int i = 1; i <= 20; i++) {
            if(i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }

    public static void printSomeNumbers() {

        int i = 1;
        int count = 0;

        while (true) {
            if(i % 2 == 0 && i % 5 ==0) {
                System.out.println(i);
                count++;
            }
            if(count == 10) {
                break;
            }
            i++;
        }

    }

}
