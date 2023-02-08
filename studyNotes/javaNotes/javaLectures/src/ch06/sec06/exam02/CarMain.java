package ch06.sec06.exam02;

public class CarMain {
    public static void main(String[] args) {
        /*Car Object Created*/
        Car myCar = new Car();

        /*Read Car Object Field*/
        System.out.println("company: "+myCar.company);
        System.out.println("on / off: "+myCar.start);
        System.out.println("current speed: "+myCar.speed);
        System.out.println("model: "+myCar.model);
        System.out.println("max speed: "+myCar.maxSpeed);

        myCar.speed = 60;
        System.out.println("modified speed: "+myCar.speed);
    }
}
