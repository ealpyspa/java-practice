package hw.hw_9_functinterfaces_lamda_stream.part1_functinterfaces_lambda;

public class FirstMain {
    public static void main(String[] args) {
        MathOperation addition = (a, b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation multiplication = (a, b) -> a * b;
        MathOperation division = (a, b) -> a / b;


        System.out.println(addition.calculate(3, 7));
        System.out.println(subtraction.calculate(3, 7));
        System.out.println(multiplication.calculate(3, 7));
        System.out.println(division.calculate(14, 7));
    }
}
