package hw8_exceptions_generics.additional_tasks;

public class Storage<T> {
    private T element;

    public Storage(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T newElement) {
        this.element = newElement;
    }
}
