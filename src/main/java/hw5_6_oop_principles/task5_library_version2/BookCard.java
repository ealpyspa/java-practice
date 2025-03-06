package hw5_6_oop_principles.task5_library_version2;

public class BookCard {
    private Book book;
    private Reader reader;
    private boolean isAvailable;

    public BookCard(Book book) {
        this.book = book;
        this.reader = null;
        this.isAvailable = true;
    }

    public Book getBook() {
        return book;
    }

    public Reader getReader() {
        return reader;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void markAsIssued(Reader reader) {
        this.isAvailable = false;
        System.out.println("Книга выдана читателю: " + reader.getName());
    }

    public void markAsReturned() {
        this.isAvailable = true;
        System.out.println("Читатель вернул книгу.");
    }
}
