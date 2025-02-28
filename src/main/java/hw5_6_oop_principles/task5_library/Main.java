package hw5_6_oop_principles.task5_library;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        Reader reader = new Reader();
        Librarian librarian = new Librarian();

        librarian.reduceCountOfBook(book);
        librarian.noteWhoTakeBook(reader);

        librarian.increaseCountOfBook(book);
        librarian.noteWhoReturnBook(reader);

    }
}
