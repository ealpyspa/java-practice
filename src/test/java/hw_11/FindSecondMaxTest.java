package hw_11;

import hw.hw_11_testing_code.FindSecondMax;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FindSecondMaxTest {
    private FindSecondMax findSecondMax;

    @BeforeEach
    public void setupTest() {
        findSecondMax = new FindSecondMax();
    }

    public static Stream<Arguments> numbersToFindSecondMax (){
        return Stream.of(
                Arguments.of(new int[] {3, 5, 7, 0}, 5),
                Arguments.of(new int[] {1, 2, 3, 4}, 3),
                Arguments.of(new int[] {-1, -2, -3, -4}, -2));
    }

    @ParameterizedTest
    @MethodSource("numbersToFindSecondMax")
    public void userCanFindSecondMax(int[] numbers, int expectedResult) {
        int actualResult = findSecondMax.findSecondMax(numbers);

        assertEquals(expectedResult, actualResult);
    }

    public static Stream<Arguments> arrayOfSameNumbers (){
        return Stream.of(
                Arguments.of((Object) new int[] {3, 3, 3, 3}));
    }

    @ParameterizedTest
    @MethodSource("arrayOfSameNumbers")
    public void userCannotFindSecondMaxIfNumbersAreSame(int[] numbers) {
        assertThrows(NoSuchElementException.class, () -> {findSecondMax.findSecondMax(numbers);});
    }

    public static Stream<Arguments> oneElementInArray (){
        return Stream.of(
                Arguments.of((Object) new int[] {5}));
    }

    @ParameterizedTest
    @MethodSource("oneElementInArray")
    public void userShouldGetExceptionIfOneNumberInArray(int[] numbers) {
        assertThrows(IllegalArgumentException.class, () -> {findSecondMax.findSecondMax(numbers);});
    }

}
