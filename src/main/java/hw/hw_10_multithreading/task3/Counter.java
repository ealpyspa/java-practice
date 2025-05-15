package hw.hw_10_multithreading.task3;

public class Counter implements Runnable {
    private volatile int counter = 0;
    private volatile boolean stop = false;


    @Override
    public void run() {
        while (!stop) {
            System.out.println(counter++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void stop() {
        this.stop = true;
    }
}
