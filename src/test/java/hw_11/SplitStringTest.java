package hw_11;

import hw.hw_11_testing_code.SplitString;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SplitStringTest {
    private SplitString splitString;

    @BeforeEach
    public void setupTest() {
        splitString = new SplitString();
    }

    public static Stream<Arguments> stringsToBeSplitted() {
        return Stream.of(
                Arguments.of(
                        "Java,Python,C++", ",", new String[] {"Java", "Python", "C++"}),
                Arguments.of("", ",", new String[] {""}),
                Arguments.of("word", ",", new String[]{"word"})
        );
    }

    @ParameterizedTest
    @MethodSource("stringsToBeSplitted")
    public void userShouldGetSplittedString(String input, String delimiter, String[] expectedResult) {
        String[] actualResult = splitString.splitString(input,delimiter);

        assertArrayEquals(expectedResult,actualResult);
    }
}
