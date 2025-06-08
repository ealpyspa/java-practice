package hw_11;

import hw.hw_11_testing_code.IsEven;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsEvenTest {
    /**
     * позитивный кейс - четные значения: 2, -4 -> true
     * негативный кейс - нечетные значения: 3, -5 -> false
     * угловой кейс - нулевое значение: 0 -> true
     */

    private IsEven isEven;

    @BeforeEach
    public void setupTest() {
        isEven = new IsEven();
    }

    @ParameterizedTest
    @ValueSource(ints = {2, -4})
    public void userShouldGetTrueForEvenNumber(int number) {
        boolean result = isEven.isEven(number);

        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(ints = {3, -5})
    public void userShouldGetFalseForOddNumber(int number) {
        boolean result = isEven.isEven(number);

        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(ints = {0})
    public void userShouldGetTrueForZeroNumber(int number) {
        boolean result = isEven.isEven(number);

        assertTrue(result);
    }
}
