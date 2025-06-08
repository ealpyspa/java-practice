package hw_11;

import hw.hw_11_testing_code.IsValidJson;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsValidJsonTest {
    private IsValidJson isValidJson;

    @BeforeEach
    public void setupTest() {
        isValidJson = new IsValidJson();
    }

    @ParameterizedTest
    @ValueSource(strings = {"{\"key\":\"value\"}"})
    public void userShouldGetTrueIfJsonIsValid(String json) {
        boolean actualResult = isValidJson.isValidJson(json);

        assertTrue(actualResult);
    }

    @ParameterizedTest
    @ValueSource(strings = {"invalid json"})
    public void userShouldGetFalseIfJsonIsNotValid(String json) {
        boolean actualResult = isValidJson.isValidJson(json);

        assertFalse(actualResult);
    }

    @ParameterizedTest
    @NullSource
    public void userShouldGetFalseIfJsonIsNull(String json) {
        boolean actualResult = isValidJson.isValidJson(json);

        assertFalse(actualResult);
    }
}
