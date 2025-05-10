package hw.hw_9_functinterfaces_lamda_stream.part4_streamapi_grouping_and_reduction;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //task1
        List<String> names = Arrays.asList("Маша", "Саша", "Аня", "Алла", "Света");

        Map<Character, List<String>> groupedNames = names.stream().collect(Collectors.groupingBy(s -> s.charAt(0)));

        System.out.println("Task1: " + groupedNames);

        //task2
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        Map<Boolean, List<Integer>> ifNumberIsEven = numbers.stream().collect(Collectors.groupingBy(x -> x % 2 == 0));

        System.out.println("Task2: " + ifNumberIsEven);

        //task3
        OptionalDouble averageNumber = numbers.stream().mapToInt(x -> x).average();

        System.out.println("Task3: " + averageNumber);

    }
}
