package practice.practice_10.multithreads;

public class SumElements {
    // посчитать сумму элементов большого массива с помощью разделения на части и использования нескольких потоков
    // разделим массив на 2 части пополам
    // первый массив: от 0 до array.lenght/2
    // второй массив: от array.lenght + 1 до array.length

    public static final int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args) throws InterruptedException {

        int sum = parallelSum(array);
        System.out.println("Сумма: " + sum);
    }

    public static int parallelSum(int[] array) throws InterruptedException {
        int halfSize = array.length / 2;

        ThreadSum firstHalf = new ThreadSum(array, 0, halfSize);
        ThreadSum secondHalf = new ThreadSum(array, halfSize, array.length);

        Thread t1 = new Thread(firstHalf);
        Thread t2 = new Thread(secondHalf);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        return firstHalf.getSum() + secondHalf.getSum();
    }

}
