package ch02.sec07;

public class PromotionExample {
    public static void main(String[] args) {
        //byte to int
        byte byteValue = 10;
        int intValue = byteValue;
        System.out.println("intValue: " + intValue);

        //int to byte
        int var1 = 10;
        byte var2 = (byte) var1;
        System.out.println("var2: " + var2);

        //int to char
        int var5 = 65;
        char var6 = (char) var5;
        System.out.println("var6: " + var6);

        int a = 5;
        int b = 2;

        System.out.println("a/b = " + a/b);
        System.out.println("a/b = "+ a/(float)b);
    }
}
