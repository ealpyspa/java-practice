package hw5_6_oop_principles.task5_library;

public class Book implements Takable, Returnable {

    @Override
    public void returnBook() {
        System.out.println("Книга возвращена.");
    }

    @Override
    public void takeBook() {
        System.out.println("Книга взята.");
    }
}
