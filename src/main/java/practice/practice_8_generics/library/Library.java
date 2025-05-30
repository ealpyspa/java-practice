package practice_8_generics.library;

import practice_8_generics.library.exceptions.BookNotFoundException;
import practice_8_generics.library.exceptions.InvalidBookException;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    // добавлять книгу
    // обработка исключения: если добавляем существующую книгу,
    // то получаем непроверяемое исключение InvalidBookException
    public void addBook(Book book) throws InvalidBookException {
        if (books.contains(book)) {
            throw new InvalidBookException("Такая книга уже существует в библиотеке.");
        } else {
            books.add(book);
        }
    }

    // искать книгу
    // обработка исключения: если не можем найти книгу,
    // то случится проверяемое исключение BookNotFoundException
    public Book findBook(String name) throws BookNotFoundException {
        AtomicReference<Book> foundBook = new AtomicReference<>();
        books.forEach(book -> {
            if (book.getName() == name) {
                foundBook.set(book);
            }
        });

        if (foundBook.get() == null) {
            throw new BookNotFoundException("Книга не найдена по имени " + name);
        }
        return foundBook.get();
    }
}
