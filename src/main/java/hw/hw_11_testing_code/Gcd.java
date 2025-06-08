package hw.hw_11_testing_code;

public class Gcd {
    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
