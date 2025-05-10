package hw.hw_9_functinterfaces_lamda_stream.part2_streamapi_basic_operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //task1
        List<String> products = Arrays.asList("Milk", "Tea", "Bread", "Coconut", "Chocolate");

        List<String> filteredProducts = products.stream()
                .filter(str -> str.length() > 5)
                .collect(Collectors.toList());

        System.out.println(filteredProducts);

        //task2
        List<Integer> numbers = Arrays.asList(1, 4, 5, 10, 3, 15);

        List<Integer> filteredNumbers = numbers.stream()
                .filter(x -> x % 5 == 0)
                .collect(Collectors.toList());

        System.out.println(filteredNumbers);

        //task3
        List<String> items = Arrays.asList("Milk", "Tea", "Bread", "Coconut", "Chocolate");

        List<Integer> itemsLength = items.stream()
                .map(str -> str.length())
                .collect(Collectors.toList());

        System.out.println(itemsLength);

        //task4
        List<Integer> initialNumbers = Arrays.asList(1, 4, 5, 10, 3, 15);

        List<Integer> modifiedNumbers = initialNumbers.stream()
                .map(x -> x * x)
                .collect(Collectors.toList());

        System.out.println(modifiedNumbers);

        //task5
        List<String> elements = Arrays.asList("Milk", "Tea", "Bread", "Coconut", "Chocolate", "Milk", "Tea");

        List<String> uniqueElements = elements.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(uniqueElements);
    }
}
