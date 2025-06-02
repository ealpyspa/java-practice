package hw_11;

import hw.hw_11_testing_code.FindMax;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FindMaxTest {

    // Может быть стоит добавить кейс c null

    private FindMax findMax;

    @BeforeEach
    public void setupTest() {
        findMax = new FindMax();
    }

    public static Stream<Arguments> numbersToFindMax() {
        return Stream.of(
                Arguments.of(new int[] {-3, 5, 7, 0}, "7"),
                Arguments.of(new int[] {-3, -5, -7, -1}, "-1"), //добавила после записи видео
                Arguments.of(new int[] {9}, "9"));
    }

    public static Stream<Arguments> emptyArray() {
        return Stream.of(
                Arguments.of((Object) new int[] {}));
    }

    @ParameterizedTest
    @MethodSource("numbersToFindMax")
    public void userCanFindMaxInArray(int[] numbers, int expectedResult) {
        int actualResult = findMax.findMax(numbers);

        assertEquals(expectedResult,actualResult);
    }

    @ParameterizedTest
    @MethodSource("emptyArray")
    public void userShouldGetExceptionIfArrayIsEmpty(int[] numbers) {
        assertThrows(NoSuchElementException.class, () -> {
            findMax.findMax(numbers);}, "Array is empty");
    }
}
