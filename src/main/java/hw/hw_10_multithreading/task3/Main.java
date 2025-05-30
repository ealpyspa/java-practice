package hw.hw_10_multithreading.task3;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread t1 = new Thread(counter);
        t1.start();
        Thread.sleep(2000);
        counter.stop();
    }
}
