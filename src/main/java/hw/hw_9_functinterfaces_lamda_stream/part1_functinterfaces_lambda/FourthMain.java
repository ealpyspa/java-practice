package hw.hw_9_functinterfaces_lamda_stream.part1_functinterfaces_lambda;

import java.util.function.Function;

public class FourthMain {
    public static void main(String[] args) {
        Function<String, Integer> getLength = str -> str.length();

        System.out.println(getLength.apply("Lips"));
    }
}
