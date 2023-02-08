package quizThree;

import java.util.Scanner;

public class Quiz6_increment_test {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("count down start");
        int x;
        do {
            System.out.println("positive input: ");
            x = scr.nextInt();
        } while (x <= 0);

        while (x >= 0) {
//            System.out.println(--x);
            System.out.println(x--);
        }

        System.out.println("x: " + x);
    }
}
