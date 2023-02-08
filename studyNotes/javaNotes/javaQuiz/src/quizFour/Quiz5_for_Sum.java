package quizFour;

import java.util.Scanner;

public class Quiz5_for_Sum {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int r = n;
        for (int i = 0; i < r; i++) {
            n += i;
        }
        System.out.println(n);
    }
}
