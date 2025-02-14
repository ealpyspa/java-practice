package hw4_conditional_operators;

import java.sql.SQLOutput;
import java.util.Scanner;

public class IfElseTasks {
    public static void main(String[] args) {
        checkNumber();
        printMax();
        printMarkDescription();
    }

    public static void checkNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");

        int number = scanner.nextInt();

        if(number > 0 ) System.out.println("Число положительное");
        else if (number < 0) System.out.println("Число отрицательное");
        else System.out.println("Число равно нулю");
    }

    public static void printMax() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int number1 = scanner.nextInt();

        System.out.println("Введите второе число: ");
        int number2 = scanner.nextInt();

        int max;

        if (number1 > number2) System.out.println(max = number1);
        else System.out.println(max = number2);
    }

    public static void printMarkDescription() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите оценку 1-5: ");

        int mark = scanner.nextInt();

        if(mark == 5) System.out.println("Отлично");
        else if (mark == 4) System.out.println("Хорошо");
        else if (mark == 3) System.out.println("Удовлетворительно");
        else if (mark == 2 || mark ==1) System.out.println("Неудовлетворительно");

    }
}
