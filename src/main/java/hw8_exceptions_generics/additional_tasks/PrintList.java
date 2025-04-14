package hw8_exceptions_generics.additional_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(2, 25, 34, 433));
        printList(list);
    }

    public static <T> void printList(List<T> list) {
        list.forEach(System.out::println);
    }
}
