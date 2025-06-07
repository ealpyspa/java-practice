package hw.hw_11_testing_code;

import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumbers {
    public List<Integer> filterEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
    }
}
