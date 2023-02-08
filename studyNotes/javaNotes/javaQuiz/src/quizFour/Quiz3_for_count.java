package quizFour;

import java.util.Scanner;

public class Quiz3_for_count {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        for(int i=n;i>0;i--){
            System.out.println(i-1);
        }
    }
}
