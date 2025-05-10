package hw.hw_9_functinterfaces_lamda_stream.part1_functinterfaces_lambda;

import java.util.function.Consumer;

public class FifthMain {
    public static void main(String[] args) {

        Consumer<String> print = System.out::println;

        print.accept("Good morning!");
    }
}
