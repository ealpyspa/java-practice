package hw7_jfc.priority_queue_1;

public class Main {
    public static void main(String[] args) {
        Task1PriorityQueue queue = new Task1PriorityQueue();

        queue.addNewEntry(105);
        queue.addNewEntry(16);
        queue.addNewEntry(130);
        queue.addNewEntry(5);
        queue.addNewEntry(15);

        queue.printQueue();
    }
}
