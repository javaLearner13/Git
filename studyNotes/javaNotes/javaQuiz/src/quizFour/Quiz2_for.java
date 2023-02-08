package quizFour;

import java.util.Scanner;

public class Quiz2_for {
    public static void main(String[] args) {
        //use for
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        for(int i=0;i<n;i++){
            System.out.print('*');
        }
    }
}
