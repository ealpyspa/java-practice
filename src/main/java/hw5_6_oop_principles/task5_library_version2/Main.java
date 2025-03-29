package hw5_6_oop_principles.task5_library_version2;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book = new Book("Нормальные люди", "Салли Руни");

        library.addBook(book);

        Reader reader = new Reader("Алиса Иванова");

        library.issueBook("Нормальные люди", reader);
        library.returnBook("Нормальные люди");

    }
}
