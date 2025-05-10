package practice_5_oop.task2_shop;

public class Clothes extends Item {
    private final static char DEFAULT_SIZE = 'M';
    private int size;
    public Clothes(String name, double price, int count) {
        super(name, price, count);
        this.size = DEFAULT_SIZE;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(", размер " + this.size);
    }
}
