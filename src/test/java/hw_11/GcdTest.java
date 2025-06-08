package hw_11;

import hw.hw_11_testing_code.Gcd;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GcdTest {
    private Gcd gcd;

    @BeforeEach
    public  void setupTest() {
        gcd = new Gcd();
    }

    @ParameterizedTest
    @CsvSource({"24, 36, 12",
                "101, 103, 1",
                "0, 10, 10"})
    public void userShouldGetGreatestCommonDivisor(int a, int b, int expectedResult) {
        int actualResult = gcd.gcd(a,b);

        assertEquals(expectedResult,actualResult);
    }
}
