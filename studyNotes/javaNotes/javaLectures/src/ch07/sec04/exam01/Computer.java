package ch07.sec04.exam01;

public class Computer extends Calculator {
    @Override
    public double areaCircle(double r) {
        System.out.println("I'm areaCircle under Computer");
//        return super.areaCircle(r);
        return 3.14*r*r;
    }

}
