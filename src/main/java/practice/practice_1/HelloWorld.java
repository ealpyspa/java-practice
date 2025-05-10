package practice_1;

public class HelloWorld {
    // поля
    static int a = 1;


    // метод
    // зеленая стрелочка = программа запускаема
    // метод main - точка входа в программу
    public static void main (String[] args) {
        System.out.println("Привет, мир!");
        System.out.println("Это Женя!");
        System.out.println(1 + 2);
        System.out.println(3 * 5);
        System.out.println("В поле а хранится: " + a);

        int sum = sum(1, 2);
        System.out.println("Результат сложения: " + sum);

        int mult1 = multiply(2, 3); // вызов метода присходит по названию
        System.out.println("Результат умножения: " + mult1);

        int subs1 = substract(6, 3);
        System.out.println("Результат вычитания: " + subs1);

        double div1 = divide(5, 2);
        System.out.println("Результат деления: " + div1);

    }

    public static int sum(int x, int y) {
        // тело метода
        return x + y; // возвращаемое значение из метода
    }

    public static int multiply(int p, int k) { // аргументы метода
        // тело метода
        int mult = p * k; // оздала переменную и присвоила значение равное результату
        // умножения p и k
        return mult;
    }

    public static int substract(int g, int l) {
        return g - l;
    }
    
    // возвращаемый тип данных - целое или нет? 3/2 = 1.5
    public static double divide(int s, int h) {
        return (double) s / h; // каст = приведение типа данных к double
    }
}
