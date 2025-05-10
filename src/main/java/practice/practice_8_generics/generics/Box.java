package practice_8_generics.generics;

public class Box <T extends Book> {
    private T element;

    public void setElement(T element) {
        this.element = element;
    }

    public T getElement() {
        return this.element;
    }
}
