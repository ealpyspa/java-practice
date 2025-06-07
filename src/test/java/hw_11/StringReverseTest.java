package hw_11;

import hw.hw_11_testing_code.StringReverse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class StringReverseTest {
    /**
     * обычная строка:
     *  "hello" -> "olleh"
     *  "World" -> "dlroW"
     *  "a" -> "a"
     * пустая строка: "" -> ""
     * null -> null
     */
    private StringReverse stringReverse;

    @BeforeEach
    public void setupTest() {
        stringReverse = new StringReverse();
    }


    @ParameterizedTest
    @CsvSource({"hello, olleh",
                "World, dlroW",
                "a, a",
                "\"\", \"\""})
    public void userShouldBeAbleReverseString(String input, String expectedResult) {
        String actualResult = stringReverse.reverse(input);

        assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @NullSource
    public void userShouldGetNullIfNullIsReversed(String input) {
        String actualResult = stringReverse.reverse(input);

        assertNull(actualResult);
    }
}
