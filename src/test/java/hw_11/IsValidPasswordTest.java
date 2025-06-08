package hw_11;

import hw.hw_11_testing_code.IsValidPassword;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsValidPasswordTest {
    private IsValidPassword isValidPassword;

    @BeforeEach
    public void setupTest() {
        isValidPassword = new IsValidPassword();
    }

    @ParameterizedTest
    @ValueSource(strings = {
            // length > 8
            "Password1",
            // length = 8
            "pAsswor9"})
    public void userShouldGetTrueIfPasswordIsValid(String password) {
        boolean actualResult = isValidPassword.isValidPassword(password);

        assertTrue(actualResult);
    }

    @ParameterizedTest
    @ValueSource(strings = {
            // length < 8
            "Passwo1",
            // no capital letter
            "passwor1",
            // no figure
            "paSsword",
            // with symbol "!"
            "passWord!"
    })
    public void userShouldGetFalseIfPasswordIsInvalid(String password) {
        boolean actualResult = isValidPassword.isValidPassword(password);

        assertFalse(actualResult);
    }

    @ParameterizedTest
    @NullSource
    public void userShouldGetFalseIfPasswordIsNull(String password) {
        boolean actualResult = isValidPassword.isValidPassword(password);

        assertFalse(actualResult);
    }
}
