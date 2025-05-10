package practice_4.solvers;

import java.util.Random;
import java.util.Scanner;

public class DoWhileTaskSolver {
    public static void main(String[] args) {
        // проверка метода по угадыванию рандомного числа
        //findNumber(1101);

        // проверка метода по поиску минимального введенного числа
        //findMinimum();

        // проверка метода по введению логина и пароля
        checkCredentials();
    }
    public static void findNumber(int bound) {
        Scanner scanner = new Scanner(System.in);

        int random = new Random().nextInt(bound);

        System.out.println(random);

        int number;
        do {
            System.out.print("Угадай число: ");
            number = scanner.nextInt();
        } while (number != random);

        System.out.println("Верно!");
    }

    public static void findMinimum() {
        Scanner scanner = new Scanner(System.in);

        int number;
        int min = Integer.MAX_VALUE; // 2147483647 - максимальное значение int

        do{
            System.out.println("Введите число: ");
            number = scanner.nextInt();
            if (number < min && number >= 0) min = number;
        } while (number >= 0);

        System.out.println("Минимальное число: " + min);
    }

    public static void checkCredentials() {
        Scanner scanner = new Scanner(System.in);

        String login;
        String password;

        do {
            System.out.println("Введите логин: ");
            login = scanner.nextLine();
            System.out.println("Введите пароль: ");
            password = scanner.nextLine();
        } while (!login.equals("admin") || !password.equals("admin"));

        System.out.println("Доступ разрешен.");



    }
}
