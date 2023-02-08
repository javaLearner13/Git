package quizThree;

import java.util.Scanner;

public class Quiz1_if {
    public static void main(String[] args) {
        int num;
        Scanner scr = new Scanner(System.in);
        num = scr.nextInt();
        if(num>0){
            System.out.println("+");
        }else if(num<0){
            System.out.println("-");
        }else{
            System.out.println("0");
        }

    }
}
