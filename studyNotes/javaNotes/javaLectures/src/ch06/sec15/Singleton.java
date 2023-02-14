package ch06.sec15;

public class Singleton {
    public Singleton() {
    }

    static Singleton getInstance(){
        return singleton;
    }

    private static Singleton singleton = new Singleton();

}
