package hw_11;

import hw.hw_11_testing_code.Factorial;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialTest {

    // можно добавить проверку, если число не целое ->
    // невозможно на уровне компиляции, метод принимает только int

    private Factorial factorial;

    @BeforeEach
    public void setupTest() {
        factorial = new Factorial();
    }

    @ParameterizedTest
    @CsvSource("0, 1")
    public void userShouldGetOneIfNIsZero(int n, int expectedResult){
        int actualResult = factorial.factorial(n);

        assertEquals(expectedResult,actualResult);
    }

    @ParameterizedTest
    @CsvSource({"1, 1",
                "5, 120",
                "7, 5040"})
    public void userShouldGetFactorialOfEnteredNumber(int n, int expectedResult){
        int actualResult = factorial.factorial(n);

        assertEquals(expectedResult,actualResult);
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, -2, -100})
    public void userShouldGetExceptionIfNIsNegative(int n) {
        assertThrows(IllegalArgumentException.class,() -> {
            factorial.factorial(n);}, "Factorial should throw IllegalArgumentException for negative input");
    }
}
