package hw4_conditional_operators;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SwitсhTasks {
    public static void main(String[] args) {
        dayOfWeek();
        printPlanetDetails();
        calculate();
    }

    public static void dayOfWeek() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число от 1 до 7: ");

        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Невалидное число.");
        }

    }

    public static void printPlanetDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите название планеты: ");

        String planet = scanner.nextLine().toUpperCase();

        int order;
        double relativeToEarthMass;

        switch (planet) {
            case "MERCURY":
                order = 1;
                relativeToEarthMass = 0.055;
                System.out.println("Порядковый номер: " + order + "\n" + "Масса относительно Земли: " + relativeToEarthMass);
                break;
            case "VENUS":
                order = 2;
                relativeToEarthMass = 0.815;
                System.out.println("Порядковый номер: " + order + "\n" + "Масса относительно Земли: " + relativeToEarthMass);
                break;
            case "EARTH":
                order = 3;
                relativeToEarthMass = 1.0;
                System.out.println("Порядковый номер: " + order + "\n" + "Масса относительно Земли: " + relativeToEarthMass);
                break;
            case "MARS":
                order = 4;
                relativeToEarthMass = 0.107;
                System.out.println("Порядковый номер: " + order + "\n" + "Масса относительно Земли: " + relativeToEarthMass);
                break;
            case "JUPITER":
                order = 5;
                relativeToEarthMass = 317.8;
                System.out.println("Порядковый номер: " + order + "\n" + "Масса относительно Земли: " + relativeToEarthMass);
                break;
            case "SATURN":
                order = 6;
                relativeToEarthMass = 95.2;
                System.out.println("Порядковый номер: " + order + "\n" + "Масса относительно Земли: " + relativeToEarthMass);
                break;
            case "URANUS":
                order = 7;
                relativeToEarthMass = 14.5;
                System.out.println("Порядковый номер: " + order + "\n" + "Масса относительно Земли: " + relativeToEarthMass);
                break;
            case "NEPTUNE":
                order = 8;
                relativeToEarthMass = 17.1;
                System.out.println("Порядковый номер: " + order + "\n" + "Масса относительно Земли: " + relativeToEarthMass);
                break;
            default:
                System.out.println("Такой планеты нет в списке.");

        }
    }

    public static void calculate() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int number1 = scanner.nextInt();

        System.out.println("Введите оператор '+', '-', '*', '/': ");
        char operator = scanner.next().charAt(0);

        System.out.println("Введите второе число: ");
        int number2 = scanner.nextInt();

        int result;

        switch (operator) {
            case '+':
                result = number1 + number2;
                System.out.println("Сумма чисел равна: " + result);
                break;
            case '-':
                result = number1 - number2;
                System.out.println("Разность чисел равна: " + result);
                break;
            case '*':
                result = number1 * number2;
                System.out.println("Произведение чисел равно: " + result);
                break;
            case '/':
                if (number2 !=0) {
                    result = number1 / number2;
                    System.out.println("Частное чисел равно: " + result);
                } else System.out.println("Делить на ноль нельзя.");
                break;
            default:
                System.out.println("Недопустимый оператор.");
        }

    }
}
