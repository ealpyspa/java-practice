package practice_8_generics.library;

import practice_8_generics.library.exceptions.BookNotFoundException;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("1984", "Orwell"));
        library.addBook(new Book("A Song of Ice and Fire", "Martin"));
        library.addBook(new Book("Martin Eden", "London"));
       // library.addBook(new Book("Martin Eden", "London"));

        try {
            library.findBook("A song");
        } catch (BookNotFoundException e) {
            System.out.println("Exception is caught.");
        }

    }
}
