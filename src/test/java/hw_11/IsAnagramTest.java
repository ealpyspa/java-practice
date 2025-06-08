package hw_11;

import hw.hw_11_testing_code.IsAnagram;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsAnagramTest {
    private IsAnagram isAnagram;

    @BeforeEach
    public void setupTest() {
        isAnagram = new IsAnagram();
    }

    @ParameterizedTest
    @CsvSource({"listen, silent",
                "Hello world!, ! dowrl H leol"})
    public void userShouldGetTrueIfStringsAreAnagrams(String str1, String str2) {
        boolean actualResult = isAnagram.isAnagram(str1, str2);

        assertTrue(actualResult);
    }

    @ParameterizedTest
    @CsvSource({"java, python",
               "Hello!, olleH"})
    public void userShouldGetFalseIfStringsAreNotAnagrams(String str1, String str2) {
        boolean actualResult = isAnagram.isAnagram(str1,str2);

        assertFalse(actualResult);
    }

    public static Stream<Arguments> nullStrings() {
        return Stream.of(
                Arguments.of(null, "Hello"),
                Arguments.of("World!", null),
                Arguments.of(null, null)
        );
    }

    @ParameterizedTest
    @MethodSource("nullStrings")
    public void userShouldGetFalseIfStringIsNull(String str1, String str2) {
        boolean actualResult = isAnagram.isAnagram(str1,str2);

        assertFalse(actualResult);

    }

}
