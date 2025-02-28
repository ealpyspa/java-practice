package hw5_6_oop_principles.task5_library;

public class Librarian {

    public void reduceCountOfBook(Book book){
        book.takeBook();
    }

    public void increaseCountOfBook(Book book){
        book.returnBook();
    }

    public void noteWhoTakeBook(Reader reader) {
        reader.takeBook();
    }

    public void noteWhoReturnBook(Reader reader) {
        reader.returnBook();
    }
}
