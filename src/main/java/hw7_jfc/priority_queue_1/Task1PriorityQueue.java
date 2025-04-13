package hw7_jfc.priority_queue_1;

import java.util.PriorityQueue;

public class Task1PriorityQueue {
    private PriorityQueue<Integer> queue;

    public Task1PriorityQueue() {
        this.queue = new PriorityQueue<>();
    }

    public void addNewEntry(Integer number) {
        queue.add(number);
    }

    public void printQueue() {
        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
