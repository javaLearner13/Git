package quizThree;

import java.util.Scanner;

public class Quiz10_howLongisNumber {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.print("enter a positive integer: ");
        int n = scr.nextInt();
        int count = 0;
        if(n>0){
            while(n>0){
                n = n/10;
                count++;
            }
        }else{
            System.out.println("invalid input");
            return;
        }

        System.out.println(count);

    }
}
