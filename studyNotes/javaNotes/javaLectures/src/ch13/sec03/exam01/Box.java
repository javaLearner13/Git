package ch13.sec03.exam01;

public class Box<T> {
    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    //fields
    private T t;
}
