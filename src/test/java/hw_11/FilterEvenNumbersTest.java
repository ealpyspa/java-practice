package hw_11;

import hw.hw_11_testing_code.FilterEvenNumbers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilterEvenNumbersTest {
    private FilterEvenNumbers filterEvenNumbers;

    @BeforeEach
    public void setupTest() {
        filterEvenNumbers = new FilterEvenNumbers();
    }

    public static Stream<Arguments> listOfNumbersToBeFiltered() {
        return Stream.of(
                Arguments.of(
                        List.of(1, 2, 3, 4, 5, 6),
                        List.of(2, 4, 6)
                )
        );
    }

    @ParameterizedTest
    @MethodSource("listOfNumbersToBeFiltered")
    public void userShouldGetListOfEvenNumbers(List<Integer> numbers, List<Integer> expectedResult) {
        List<Integer> actualResult = filterEvenNumbers.filterEvenNumbers(numbers);

        assertEquals(expectedResult,actualResult);
    }

    public static Stream<Arguments> listWithoutEvenNumbers() {
        return Stream.of(
                Arguments.of(
                        List.of(1, 3, 5, 7),
                        List.of()
                )
        );
    }

    @ParameterizedTest
    @MethodSource("listWithoutEvenNumbers")
    public void userShouldGetEmptyListOfEvenNumbersIfInitialListDoesNotHaveEvenNumbers(List<Integer> numbers, List<Integer> expectedResult) {
        List<Integer> actualResult = filterEvenNumbers.filterEvenNumbers(numbers);

        assertEquals(expectedResult,actualResult);
    }

    public static Stream<Arguments> emptyListToBeFiltered() {
        return Stream.of(
                Arguments.of(
                        List.of(),
                        List.of()
                )
        );
    }

    @ParameterizedTest
    @MethodSource("emptyListToBeFiltered")
    public void userShouldGetEmptyListIfInitialListIsEmpty(List<Integer> numbers, List<Integer> expectedResult) {
        List<Integer> actualResult = filterEvenNumbers.filterEvenNumbers(numbers);

        assertEquals(expectedResult,actualResult);
    }
}
