package hw_11;

import hw.hw_11_testing_code.FindAverage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FindAverageTest {
    private FindAverage findAverage;

    @BeforeEach
    public void setupTest(){
        findAverage = new FindAverage();
    }

    public static Stream<Arguments> numbersForFindingAverage() {
        return Stream.of(
                Arguments.of(new int[] {1, 2, 3, 4, 5}, 3.0),
                Arguments.of(new int[] {7, 15, -7}, 5.0),
                Arguments.of(new int[] {10}, 10)
        );
    }

    @ParameterizedTest
    @MethodSource("numbersForFindingAverage")
    public void userShouldGetAverage(int[] numbers, double expectedResult) {
        double actualResult = findAverage.findAverage(numbers);

        assertEquals(expectedResult,actualResult);
    }

    public static Stream<Arguments> emptyArray() {
        return Stream.of(
                Arguments.of((Object) new int[]{})
        );
    }

    @ParameterizedTest
    @MethodSource("emptyArray")
    public void userShouldGetExceptionIfArrayIsEmpty(int[] numbers) {
        assertThrows(NoSuchElementException.class, () -> findAverage.findAverage(numbers));
    }
}
