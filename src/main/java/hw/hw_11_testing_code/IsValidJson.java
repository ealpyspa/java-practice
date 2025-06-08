package hw.hw_11_testing_code;

import com.fasterxml.jackson.databind.ObjectMapper;

public class IsValidJson {
    public boolean isValidJson(String json) {
        try {
            new ObjectMapper().readTree(json);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
