package ch07.sec04.exam01;

public class OverrideMain {
    public static void main(String[] args) {
        int r = 10;
        Calculator calculator = new Calculator();
        System.out.println("Surface area: "+ calculator.areaCircle(r));
        System.out.println();

        Computer computer = new Computer();
        System.out.println("Surface area: "+ computer.areaCircle(r));

    }
}
