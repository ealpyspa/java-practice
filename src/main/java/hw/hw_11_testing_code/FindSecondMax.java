package hw.hw_11_testing_code;

import java.util.Arrays;

public class FindSecondMax {
    public int findSecondMax(int[] numbers) {
        return Arrays.stream(numbers).distinct().sorted().skip(numbers.length - 2).findFirst().orElseThrow();
    }
}
