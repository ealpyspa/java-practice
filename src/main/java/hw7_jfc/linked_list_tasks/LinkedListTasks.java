package hw7_jfc.linked_list_tasks;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class LinkedListTasks {
    public static void main(String[] args) {
        // task1
        LinkedList<String> strings = new LinkedList<>();

        strings.add("zara");
        strings.add("hm");
        strings.add("cos");
        strings.add("mango");
        strings.add("nike");

        printAllElements(strings);

        // task2
        Queue<String> tasks = new LinkedList<>();

        tasks.add("Task1: Create");
        tasks.add("Task2: Assign");
        tasks.add("Task3: Print");

        while(!tasks.isEmpty()) {
            System.out.println(tasks.poll());
        }

        // task3
        LinkedList<String> strings1 = new LinkedList<>(Arrays.asList("Rihanna", "SZA", "Imagine Dragons", "Doja"));

        System.out.println(strings1.getFirst());
        System.out.println(strings1.getLast());

        // task4
        LinkedList<Integer> ints = new LinkedList<>(Arrays.asList(1, 3, 2, 8, 4));

        int sum = 0;
        for (Integer anInt : ints) {
            sum = sum +anInt;
        }
        System.out.println(sum);

        // task5
        // LinkedList<String> strings1 = new LinkedList<>(Arrays.asList("Rihanna", "SZA", "Imagine Dragons", "Doja"));

        ListIterator<String> iterator = strings1.listIterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }

    // task1
    public static void printAllElements(LinkedList<String> strings) {
        for (String string : strings) {
            System.out.println(string);
        }
    }

}
