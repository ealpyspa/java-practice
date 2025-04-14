package hw8_exceptions_generics.generics;

public class Box<T> {
    private T element;

    public Box(T element) {
        this.element = element;
    }

    public T getElement() {
        return this.element;
    }

    public void setElement(T newElement) {
        this.element = newElement;
    }

}
