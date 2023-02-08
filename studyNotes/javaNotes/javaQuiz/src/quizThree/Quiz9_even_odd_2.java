package quizThree;

import java.util.Scanner;

public class Quiz9_even_odd_2 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        if(n>0){
            int i = 0;
            while(i<n/2){
                System.out.print("*+");
                i++;
            }
            if(n%2==1){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
