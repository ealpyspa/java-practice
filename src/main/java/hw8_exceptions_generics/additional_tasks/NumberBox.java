package hw8_exceptions_generics.additional_tasks;

import java.util.ArrayList;
import java.util.List;

public class NumberBox<T extends Number> {
    private List<T> numbers = new ArrayList<>();

    public void addNumber(T newNumber) {
        numbers.add(newNumber);
    }

    public int sum() {
        int sum = 0;
        for (T element : numbers) {
            sum = element.intValue() + sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        NumberBox<Integer> numberBox = new NumberBox<>();
        numberBox.addNumber(3);
        numberBox.addNumber(5);
        numberBox.addNumber(2);

        System.out.println(numberBox.sum());
    }
}
