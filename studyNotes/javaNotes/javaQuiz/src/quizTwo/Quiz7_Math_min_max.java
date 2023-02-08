package quizTwo;

import java.util.Scanner;

public class Quiz7_Math_min_max {
    public static void main(String[] args) {
        int num1, num2;
        Scanner scr = new Scanner(System.in);
        num1 = scr.nextInt();
        num2 = scr.nextInt();

        int max = num1>num2?num1:num2;
        int min = Math.min(num1,num2);
        System.out.println(max+"\t"+min);
    }
}
