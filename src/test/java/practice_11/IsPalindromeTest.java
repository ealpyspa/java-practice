package practice_11;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class IsPalindromeTest extends StringProcessorTest{
    /**
     * Тесты для проверки, является ли палиндромом
     *  позитивные кейсы:
     *  - четное количество: "abba" -> true
     *  - нечетное количество: "hah" -> true
     *  негативные кейсы:
     *  - "john" -> false
     *  corner cases:
     *  - "a" -> true
     *  - "" -> true
     *  - null -> IllegalArgumentException
     */

    @ParameterizedTest
    @ValueSource(strings = {
            // позитивные кейсы
            "abba", "hah",
            // угловые кейсы
            "a", ""})
    public void userCancheckIfValidStringIsPalindrome(String initialString) {
        boolean actualResult = stringProcessor.isPalindrome(initialString);

        assertTrue(actualResult);
    }

    @Test
    public void userCanCheckIfInvalidStringIsPalindrome() {
        String initialString = "john";

        boolean actualResult = stringProcessor.isPalindrome(initialString);

        assertFalse(actualResult);
    }

    @Test
    public void userCannotCheckIfNullIsPalindrome() {
        assertThrows(IllegalArgumentException.class, () -> {
            stringProcessor.reverse(null);
        }, "Checking if Null string is palindrome should lead to IllegalArgumentException");
    }
}
