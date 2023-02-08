package quizThree;

import java.util.Scanner;

public class Quiz2_while {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        int num;

        while (true) {
            num = scr.nextInt();
            if(num>=100&&num<1000){
                System.out.println(num);
                break;
            }
        }


    }
}
