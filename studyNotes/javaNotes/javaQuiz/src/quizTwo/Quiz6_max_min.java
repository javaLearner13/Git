package quizTwo;

import java.util.Scanner;

public class Quiz6_max_min {
    public static void main(String[] args) {
        int num1, num2;
        Scanner scr = new Scanner(System.in);
        num1 = scr.nextInt();
        num2 = scr.nextInt();
        int max = Math.max(num1, num2);
        int min = Math.min(num1, num2);
        if (max == min) {
            System.out.println("same value");

        } else {
            System.out.println("max: " + max);
            System.out.println("min: " + min);
        }
    }
}