package hw7_jfc.array_deque_task3;

public class Main {
    public static void main(String[] args) {
        Task3ArrayDeque deque = new Task3ArrayDeque();

        deque.addNewEntryFirst("Spar");
        deque.addNewEntryLast("Zara");
        deque.addNewEntryFirst("Tesco");
        deque.addNewEntryLast("HM");
        deque.addNewEntryFirst("Bershka");

        // Result: Bershka, Tesco, Spar, Zara, HM

        deque.removeFirstAndPrintResults(); // Result: Tesco, Spar, Zara, HM
        deque.removeFirstAndPrintResults(); // Result: Spar, Zara, HM
        deque.removeLastAndPrintResults(); // Result: Spar, Zara
        deque.removeLastAndPrintResults(); // Result: Spar



    }
}
