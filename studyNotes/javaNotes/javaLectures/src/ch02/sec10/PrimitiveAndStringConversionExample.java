package ch02.sec10;

public class PrimitiveAndStringConversionExample {
    public static void main(String[] args) {
        int value1 = Integer.parseInt("10");
        double value2 = Double.parseDouble("3.14");
        boolean value3 = Boolean.parseBoolean("true");

        System.out.println("parseInt: "+value1);
        System.out.println("parseDouble: "+value2);
        System.out.println("parseBoolean: "+value3);
    }
}
