package ch06.sec08.exam01;

public class CalculatorMain {
    public static void main(String[] args) {
        //create object
        Calculator myCalc = new Calculator();
        //call powerOn() method
        myCalc.powerOn();

        int result1 = myCalc.plus(5, 6);
        System.out.println("result1: " + result1);

        int x = 10;
        int y = 4;
        double result2 = myCalc.divide(x, y);
        System.out.println("result2: " + result2);

        myCalc.powerOff();

    }
}
