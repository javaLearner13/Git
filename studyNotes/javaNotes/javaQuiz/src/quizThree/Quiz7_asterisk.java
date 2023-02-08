package quizThree;

import java.util.Scanner;

public class Quiz7_asterisk {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        if(num>0){
            do{
                System.out.print("*");
                num--;
            }while(num>0);
        }
    }
}
