package ch06.sec09;

public class CarMain {
    public static void main(String[] args) {

        Car myCar = new Car("Porsche");
        Car yourCar = new Car("Mercedes");
//        myCar.setSpeed();
        myCar.run();
//        yourCar.setSpeed();
        yourCar.run();
    }
}
