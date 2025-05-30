package practice.practice_9.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FilterListMain {
    public static void main(String[] args) {
        // 1. Создать список целых чисел, далее отфильтровать все четные числа и суммировать их
        // Промежуточная операция: фильтрация по четности
        // Терминальная операция: суммирование

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        IntStream stream = numbers.stream()
                .filter(n -> {
                    System.out.println("filter: " + n);
                    return n % 2 == 0;
                })
                .mapToInt(n -> {
                    System.out.println("mapToInt:" + n);
                    return n;
                });

        System.out.println("Stream is created, but terminal method is not called yet.");

        int sum = stream.sum();

        System.out.println(sum);
    }
}
