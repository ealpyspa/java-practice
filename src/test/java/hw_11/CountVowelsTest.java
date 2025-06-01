package hw_11;

import hw.hw_11_testing_code.CountVowels;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CountVowelsTest {
    /**
     * позитивный кейс (есть гласные):
     *      "hello" -> 2
     *      "java" -> 2
     *      "AEIOU" -> 5
     * негативный кейс (гласных нет):
     *      "bmw" -> 0
     *      "" -> 0
     * угловой кейс:
     *      null -> IllegalArgumentException
     */

    private CountVowels countVowels;
    @BeforeEach
    public void setupTest() {
        countVowels = new CountVowels();
    }

    @ParameterizedTest
    @CsvSource({
            "hello, 2",
            "java, 2",
            "AEIOU, 5"
    })
    public void userCanCountVowelsInValidString(String input, int expectedResult) {
        int actualResult = countVowels.countVowels(input);

        assertEquals(expectedResult, actualResult, "Vowels count is incorrect.");
    }

    @ParameterizedTest
    @CsvSource({
            "bmv, 0",
            "\"\", 0"
    })
    public void userCanCountVowelsInInvalidString(String input, int expectedResult) {
        int actualResult = countVowels.countVowels(input);

        assertEquals(expectedResult, actualResult, "Vowels count is incorrect.");
    }

    @ParameterizedTest
    @NullSource
    public void userCannotCountVowelsWhenStringIsNull(String input){
        assertThrows(IllegalArgumentException.class, () -> {
            countVowels.countVowels(input);}, "Counting vowels in the null String should lead to IllegalArgumentException"
        );
    }
}
