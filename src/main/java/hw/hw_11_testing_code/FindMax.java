package hw.hw_11_testing_code;

import java.util.Arrays;

public class FindMax {
    public int findMax(int[] numbers) {
        return Arrays.stream(numbers).max().orElseThrow();
    }
}
