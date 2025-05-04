package hw.hw_9_functinterfaces_lamda_stream.part1_functinterfaces_lambda;

import java.util.function.Predicate;

public class ThirdMain {
    public static void main(String[] args) {

        Predicate<Integer> isEven = x -> x % 2 == 0;

        System.out.println(isEven.test(4));
        System.out.println(isEven.test(3));
    }
}
