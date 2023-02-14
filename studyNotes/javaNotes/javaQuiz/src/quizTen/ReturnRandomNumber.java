package quizTen;

import java.util.Random;
import java.util.Scanner;

public class ReturnRandomNumber {

    static int returnRandomNumber(int a, int b) {
        Random rand = new Random();
        int n = rand.nextInt(b - a + 1) + a;
        return n;
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int a, b;
        do {
            System.out.print("enter a: ");
            a = scr.nextInt();
            System.out.print("enter b: ");
            b = scr.nextInt();
        } while (a > b);
        System.out.println(returnRandomNumber(a, b));
    }
}
