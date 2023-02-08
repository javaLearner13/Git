package ch06.sec07.exam04;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println("car1.company: " + car1.company);
        System.out.println();

        Car car2 = new Car("personal automobile");
        System.out.println("car2.company: " + car2.company);
        System.out.println("car2.model: " + car2.model);

        //generate -> toString
        System.out.println(car1);
        System.out.println(car2);
    }
}
