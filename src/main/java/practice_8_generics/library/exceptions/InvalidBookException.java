package practice_8_generics.library.exceptions;
// непроверяемый -> RunTimeException
public class InvalidBookException extends RuntimeException {
    public InvalidBookException(String message) {
        super(message);
    }
}
