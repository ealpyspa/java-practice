package hw.hw_9_functinterfaces_lamda_stream.part3_streamapi_aggregation_operations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        //task1
        List<Integer> numbers = Arrays.asList(2, 100, 98, 101, 5);

        Integer maxNumber = numbers.stream().max(Comparator.naturalOrder()).get();

        System.out.println("task1: " + maxNumber);

        //task2
        Integer minNumber = numbers.stream().min(Comparator.naturalOrder()).get();

        System.out.println("task2: " + minNumber);

        //task3
        Integer sum = numbers.stream().mapToInt(x -> x).sum();

        System.out.println("task3: " + sum);

        //task4
        List<String> elements = Arrays.asList("Вареники", "Грибы", "Бублики", "Баранки");

        Optional<String> firstMatchedElement = elements.stream().filter(str -> str.startsWith("Б")).findFirst();

        System.out.println("task4: " + firstMatchedElement);

        //task5
        Boolean ifEvenNumberPresented = numbers.stream().anyMatch(x -> x % 2 ==0);

        System.out.println("task5: " + ifEvenNumberPresented);
    }
}
