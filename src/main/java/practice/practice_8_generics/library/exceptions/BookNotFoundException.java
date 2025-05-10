package practice_8_generics.library.exceptions;
// проверяемое -> Exception (наследников)
public class BookNotFoundException extends Exception {
    public BookNotFoundException(String message) {
        super(message);
    }
}
