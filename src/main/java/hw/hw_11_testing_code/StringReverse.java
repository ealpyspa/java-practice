package hw.hw_11_testing_code;

public class StringReverse {
    public String reverse(String input) {
        if(input == null) return null;
        return new StringBuilder(input).reverse().toString();
    }
}
