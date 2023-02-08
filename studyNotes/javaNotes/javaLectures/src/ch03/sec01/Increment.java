package ch03.sec01;

public class Increment {
    public static void main(String[] args) {


        int y;
        int x = 10;

        y = x++; // 10, 10
        System.out.println("x= " + x); // 11, 10
        System.out.println("y= " + y); // 11, 10
        y = ++x; // 12, 12
        System.out.println("x= " + x); // 12, 12
        System.out.println("y= " + y); // 12, 12

        for (int i = 0; i < 3; i++) {
            y = x++;            // (12, 12), (13, 13), (14, 14) // (15, 14 as exit)
        }
        // (15, 14)
        System.out.println("x= " + x);
        System.out.println("y= " + y);
    }
}
