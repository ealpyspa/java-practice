package practice.practice_9.lambda;

public class Main {
    public static void main(String[] args) {
        // анонимный класс
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Привет, мир!");
            }
        };

        r1.run();


        Runnable r2 = () -> System.out.println("Hello world!");

        r2.run();
    }
}
