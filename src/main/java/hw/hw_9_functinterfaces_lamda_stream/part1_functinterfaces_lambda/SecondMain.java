package hw.hw_9_functinterfaces_lamda_stream.part1_functinterfaces_lambda;

public class SecondMain {
    public static void main(String[] args) {

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous class!");
            }
        };

        r1.run();
    }
}
