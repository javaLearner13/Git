package ch06.sec07.exam04;
/* class is made up of field, constructors, methods(functions) */
/* class name and constructor name should always match */
public class Car {
    //field
    String company = "Hyundai";
    String model;
    String color;
    int maxSpeed;

    //constructor

    /*default constructor*/
    /* = Method? */
    public Car() {
        System.out.println("\nconstructor successfully generated");
    }

    public Car(String model) {
        this.model = model;
    }

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
