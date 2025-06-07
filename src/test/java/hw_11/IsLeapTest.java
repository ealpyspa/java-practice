package hw_11;

import hw.hw_11_testing_code.IsLeap;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsLeapTest {
    /**
     * високосный: % 4, не % 100 -
     *      2020 -> true
     *      2016 -> true
     * високосный: % 400
     *      2000 -> true
     *      1600 -> true
     * невисокосный: не % 4
     *      2021 -> false
     *      2023 -> false
     * невисокосный: % 100, но не % 400
     *      1900 -> false
     *      1800 -> false
     */

    private IsLeap isLeap;
    @BeforeEach
    public void setupTest() {
        isLeap = new IsLeap();
    }

    @ParameterizedTest
    @ValueSource(ints = {
            // високосный: % 4, не % 100
            2020, 2016,
            //високосный: % 400
            2000, 2016})
    public void userShouldGetTrueIfYearIsLeap(int year) {
        boolean actualResult = isLeap.isLeapYear(year);
        assertTrue(actualResult);
    }

    @ParameterizedTest
    @ValueSource(ints = {
            // невисокосный: не % 4
            2021, 2023,
            //невисокосный: % 100, но не % 400
            1900, 1800})
    public void userShouldGetFalseIfYearIsNotLeap(int year) {
        boolean actualResult = isLeap.isLeapYear(year);
        assertFalse(actualResult);
    }

}
