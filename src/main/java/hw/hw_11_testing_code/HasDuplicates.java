package hw.hw_11_testing_code;

import java.util.Arrays;

public class HasDuplicates {
    public boolean hasDuplicates(int[] numbers) {
        return Arrays.stream(numbers).distinct().count() != numbers.length;
    }
}
