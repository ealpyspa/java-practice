package hw5_6_oop_principles.task5_library_version2;

public class Reader {
    private String name;

    public Reader(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void borrowBook(Book book) {
        System.out.println("Читатель взял книгу: " + book.getTitle());
    }
    public void returnBook(Book book) {
        System.out.println("Читатель вернул книгу: " + book.getTitle());
    }
}
