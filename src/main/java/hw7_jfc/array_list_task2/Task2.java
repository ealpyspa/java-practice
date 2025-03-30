package hw7_jfc.array_list_task2;

import java.util.ArrayList;

public class Task2 {
    private ArrayList<Integer> list;

    public Task2() {
        this.list = new ArrayList<>();
    }

    public void addInteger(Integer newInteger) {
        list.add(newInteger);
    }

    public void printEvenIntegers() {
        System.out.println("Even integers: ");
        for (Integer number: list) {
            if(number % 2 == 0)
                System.out.println(number);
        }
    }
}
