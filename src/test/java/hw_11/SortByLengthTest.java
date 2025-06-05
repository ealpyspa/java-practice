package hw_11;

import hw.hw_11_testing_code.SortByLength;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortByLengthTest {
    private SortByLength sortByLength;

    @BeforeEach
    public void setupTest() {
        sortByLength = new SortByLength();
    }

    public static Stream<Arguments> listOfWordsToBeSorted() {
        return Stream.of(
                Arguments.of(
                        List.of("Java", "C", "Python"),
                        List.of("C", "Java", "Python")
                )
        );
    }

    @ParameterizedTest
    @MethodSource("listOfWordsToBeSorted")
    public void userShouldGetSortedListByLength(List<String> words, List<String> expectedResult) {
        List<String> actualResult = sortByLength.sortByLength(words);

        assertEquals(expectedResult,actualResult);

    }

    public static Stream<Arguments> listOfWordsWithSameLength() {
        return Stream.of(
                Arguments.of(
                        List.of("aa", "bb", "cc"),
                        List.of("aa", "bb", "cc")
                )
        );
    }

    @ParameterizedTest
    @MethodSource("listOfWordsWithSameLength")
    public void userShouldGetTheSameList(List<String> words, List<String> expectedResult) {
        List<String> actualResult = sortByLength.sortByLength(words);

        assertEquals(expectedResult, actualResult);
    }

    public static Stream<Arguments> emptyList() {
        return Stream.of(
                Arguments.of(
                        List.of(),
                        List.of()
                )
        );
    }

    @ParameterizedTest
    @MethodSource("emptyList")
    public void userShouldGetEmptyListIfInitialListIsEmpty(List<String> words, List<String> expectedResult) {
        List<String> actualResult = sortByLength.sortByLength(words);

        assertEquals(expectedResult, actualResult);
    }
}
