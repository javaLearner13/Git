package ch06.sec06.exam01;

public class CarMain {
    public static void main(String[] args) {
        /*Car Object Created*/
        Car myCar = new Car();

        /*Read Car Object Field*/
        System.out.println("model Name: "+myCar.model);
        System.out.println("on / off: "+myCar.start);
        System.out.println("current speed: "+myCar.speed);
    }
}
