package quizFour;

import java.util.Scanner;

public class Quiz1 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int count = n - 1;
        while(count>0){
            n*=count;
            count--;
        }
        System.out.println(n);
    }
}
