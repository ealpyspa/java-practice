package hw7_jfc.array_list_task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.addInteger(44);
        main.printList();
    }

    List<Integer> list = new ArrayList<>(Arrays.asList(34, 123, -59, 99, 1));

    public void addInteger(Integer newInteger) {
        list.addLast(newInteger);
    }

    public void printList() {
        System.out.println("All integers: ");
        list.forEach(System.out::println);
    }


}
