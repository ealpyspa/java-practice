package hw_11;

import hw.hw_11_testing_code.MapToLengths;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MapToLengthsTest {
    private MapToLengths mapToLengths;

    @BeforeEach
    public void setupTest() {
        mapToLengths = new MapToLengths();
    }

    public static Stream<Arguments> stringsToBeMapped() {
        return Stream.of(
                Arguments.of(
                        List.of("Java","C++", "Go","Hello world1!", ""),
                        List.of(4, 3, 2, 13, 0)
                )
        );
    }

    @ParameterizedTest
    @MethodSource("stringsToBeMapped")
    public void userShouldGetListOfLengths(List<String> words, List<Integer> expectedResult) {
        List<Integer> actualResult = mapToLengths.mapToLengths(words);

        assertEquals(expectedResult,actualResult);
    }

    public static Stream<Arguments> emptyListToBeMapped(){
        return Stream.of(
                Arguments.of(
                        List.of(),
                        List.of()
                )
        );
    }

    @ParameterizedTest
    @MethodSource("emptyListToBeMapped")
    public void userShouldGetEmptyListIfInitialListIsEmpty(List<String> words, List<Integer> expectedResult) {
        List<Integer> actualResult = mapToLengths.mapToLengths(words);

        assertEquals(expectedResult,actualResult);
    }
}
