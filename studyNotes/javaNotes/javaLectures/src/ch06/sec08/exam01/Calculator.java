package ch06.sec08.exam01;

/* method(function) uses camel naming and starts with lowercase */
public class Calculator {

    //declare method without return value
    void powerOn() {
        System.out.println("-----------power on.");
    }

    void powerOff() {
        System.out.println("-----------power off.");
    }

    int plus(int x, int y) {
        int result = x + y;
        return result;
    }

    double divide(int x, int y) {
        double result = (double) x / y;
        return result;
    }

}
