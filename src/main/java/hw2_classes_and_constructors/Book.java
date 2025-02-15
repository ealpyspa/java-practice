package hw2_classes_and_constructors;

public class Book {
    public static void main(String[] args) {
        Book book = new Book("Гарри Поттер", "Джейн Роулинг");

        book.setAuthor("Джоан Роулинг");
        book.printInfo();
    }

    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle (String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void printInfo() {
        System.out.println("Название: " + title + ", Автор: " + author);
    }
}
