package ch06.sec09;

import java.util.Scanner;

public class Car {


    //field
    String model;
    int speed;

    //constructors
    //default
    public Car() {

    }

    //model constructor
    public Car(String model) {
        this.model = model;
    }

    //methods
//    void setSpeed(int speed){
//        this.speed = speed;
//    }

    void setSpeed() {
        Scanner scr = new Scanner(System.in);
        System.out.println("enter speed: ");
        this.speed = scr.nextInt();

    }

    void run() {
        this.setSpeed();
        System.out.println(this.model + " is running at " + this.speed);
    }
}
