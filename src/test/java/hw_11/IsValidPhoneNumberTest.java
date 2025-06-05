package hw_11;

import hw.hw_11_testing_code.IsValidPhoneNumber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsValidPhoneNumberTest {
    private IsValidPhoneNumber isValidPhoneNumber;

    @BeforeEach
    public void setupTest() {
        isValidPhoneNumber = new IsValidPhoneNumber();
    }

    @ParameterizedTest
    @ValueSource(strings = {
            // country code contains 1 figure
            "+1 1234567890",
            // country code contains 2 figures
            "+12 1234567891",
            // country code contains 3 figures
            "+123 1234567892"
    })
    public void userShouldGetTrueIfNumberIsValid(String phone) {
        boolean actualResult = isValidPhoneNumber.isValidPhoneNumber(phone);

        assertTrue(actualResult);
    }

    @ParameterizedTest
    @ValueSource(strings = {
            // without "+"
            "1 1234567890",
            // without country code
            "+ 1234567890",
            // country code contains 4 figures
            "+1234 1234567892",
            // without space between country code and phone number
            "+11234567890",
            // without "+", country code
            "1234567890",
            // phone number contains 9 figures
            "+12 123456789",
            // phone number contains 11 figures
            "+123 12345678987"
    })
    public void userShouldGetFalseIfNumberIsInvalid(String phone) {
        boolean actualResult = isValidPhoneNumber.isValidPhoneNumber(phone);

        assertFalse(actualResult);
    }
}
