package hw.hw_11_testing_code;

import java.util.Arrays;

public class FindAverage {
    public double findAverage(int[] numbers) {
        return Arrays.stream(numbers).average().orElseThrow();
    }
}
