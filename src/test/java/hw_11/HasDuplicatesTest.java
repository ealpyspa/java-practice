package hw_11;

import hw.hw_11_testing_code.HasDuplicates;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HasDuplicatesTest {
    private HasDuplicates hasDuplicates;

    @BeforeEach
    public void setupTest() {
        hasDuplicates = new HasDuplicates();
    }

    public static Stream<Arguments> arrayOfNumbers() {
        return Stream.of(
                // array doesn't have duplicates
                Arguments.of((Object) new int[] {1, 2, 3, 4, 5}),
                // empty array
                Arguments.of((Object) new int[] {})
        );
    }

    @ParameterizedTest
    @MethodSource("arrayOfNumbers")
    public void userShouldGetFalseIfArrayHasNotDuplicatesOrEmpty(int[] numbers) {
        boolean actualResult = hasDuplicates.hasDuplicates(numbers);

        assertFalse(actualResult);
    }

    public static Stream<Arguments> arrayOfNumbersWithDuplicates() {
        return Stream.of(
                Arguments.of((Object) new int[] {1, 2, 2, 3})
        );
    }

    @ParameterizedTest
    @MethodSource("arrayOfNumbersWithDuplicates")
    public void userShouldGetTrueIfArrayHasDuplicates(int[] numbers) {
        boolean actualResult = hasDuplicates.hasDuplicates(numbers);

        assertTrue(actualResult);
    }
}
