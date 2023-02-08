package quizThree;

import java.util.Scanner;

public class Quiz5_countDown {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        while(true){
            int num = scr.nextInt();
            if(num>0){
                do {
                    System.out.println(num);
                    num--;
                } while (num >= 0);
            }
        }
    }
}
