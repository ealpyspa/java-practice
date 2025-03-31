package hw7_jfc.array_deque_task3;

import java.util.ArrayDeque;

public class Task3ArrayDeque {
    private ArrayDeque<String> deque;

    public Task3ArrayDeque() {
        this.deque = new ArrayDeque<>();
    }

    public void addNewEntryFirst(String name) {
        deque.addFirst(name);
    }

    public void addNewEntryLast(String name) {
        deque.addLast(name);
    }

    public void removeFirstAndPrintResults() {
        deque.removeFirst();
        System.out.println(deque);
    }

    public void removeLastAndPrintResults() {
        deque.removeLast();
        System.out.println(deque);
    }
}
