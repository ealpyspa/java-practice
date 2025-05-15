package hw.hw_10_multithreading.task1;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 5; i++) {
                System.out.println("Привет из потока!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        t1.start();
    }
}
