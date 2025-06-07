package hw.hw_11_testing_code;

import java.util.List;
import java.util.stream.Collectors;

public class MapToLengths {
    public List<Integer> mapToLengths(List<String> words) {
        return words.stream().map(String::length).collect(Collectors.toList());
    }
}
