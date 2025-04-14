package hw8_exceptions_generics.additional_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListTaskSolver {
    public static void main(String[] args) {
        // task 4
        List<Integer> integerList = new ArrayList<>(Arrays.asList(3, 4, 5, 6));
        System.out.println(sumElements(integerList));

    }

    // task 4
    public static <T extends Number> int sumElements(List<T> list) {
        int sum = 0;
        for (T element : list) {
            sum += element.intValue();
        }
        return sum;
    }

    // task 5
    public void addNumber(List<? super Number> list, int a, int b) {
        list.add(a);
        list.add(b);
    }


}

