package quizTwo;

import java.util.Scanner;
/*
* get 3 integers and find the minimum
* */
public class Quiz4_find_minimum {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int num1 = scnr.nextInt();
        int num2 = scnr.nextInt();
        int num3 = scnr.nextInt();

        int min = num1<num2? (num1<num3? num1:num3):(num2<num3? num2:num3);
        System.out.println("smallest value: "+min);

    }
}
