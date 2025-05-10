package hw5_6_oop_principles.task5_library_version2;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<BookCard> bookCards = new ArrayList<>();

    public Library() {
        this.bookCards = new ArrayList<>();
    }

    public void addBook(Book book) {
        bookCards.add(new BookCard(book));
        System.out.println("Новая книга добавлена в библиотеку: " + book.getTitle());
    }

    public void issueBook(String bookTitle, Reader reader) {
        for (BookCard bookCard : bookCards) {
            if (bookCard.getBook().getTitle().equals(bookTitle) && bookCard.isAvailable()) {
                bookCard.markAsIssued(reader);
                return;
            }
        }
        System.out.println("Книга: " + bookTitle + " недоступна.");
    }

    public void returnBook(String bookTitle) {
        for (BookCard bookCard : bookCards) {
            if (bookCard.getBook().getTitle().equals(bookTitle) && !bookCard.isAvailable()) {
                bookCard.markAsReturned();
                return;
            }
        }
        System.out.println("Книга не выдавалась.");
    }

}
