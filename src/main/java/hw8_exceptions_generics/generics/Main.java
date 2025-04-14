package hw8_exceptions_generics.generics;

public class Main {
    public static void main(String[] args) {
        Integer[] array = {100, 23, 45, 88};
        printArray(array);
    }

    public static <T> void printArray(T[] array) {
        for (T t : array) {
            System.out.println(t);
        }
    }
}
