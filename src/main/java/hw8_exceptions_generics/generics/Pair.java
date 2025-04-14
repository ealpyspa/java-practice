package hw8_exceptions_generics.generics;

public class Pair <T, K> {
    private T t;
    private K k;

    public Pair(T t, K k) {
        this.t = t;
        this.k = k;
    }

    public T getT() {
        return this.t;
    }

    public K getK() {
        return this.k;
    }

    public void setT(T newT) {
        this.t = newT;
    }

    public void setK(K newK) {
        this.k = newK;
    }
}
