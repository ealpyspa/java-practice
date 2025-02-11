package hw1_first_program;

public class TenthTask {
    public static void main(String[] args) {
        System.out.println(celsiusToFahrenheit(-3));
        System.out.println(celsiusToFahrenheit(3));

        System.out.println(fahrenheitToCelsius(26.6));
        System.out.println(fahrenheitToCelsius(37.4));
        System.out.println(fahrenheitToCelsius(79));
    }

    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
