package ch02.sec04;

public class FloatDoubleExample {
    public static void main(String[] args) {
        /*precision check*/
        float num1 = 0.1234567890123456789f;
        double num2 = 0.1234567890123456789;
        System.out.println("float: " + num1);
        System.out.println("double: " + num2);
        /**/
        double num3 = 3e6;
        float num4 = 3e6f;
        double num5 = 2e-3;
        System.out.println("num3: " + num3);
        System.out.println("num4: " + num4);
        System.out.println("num5: " + num5);
    }
}
