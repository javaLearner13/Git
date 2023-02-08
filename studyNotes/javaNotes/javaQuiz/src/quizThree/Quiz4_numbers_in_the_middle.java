package quizThree;

import java.util.Scanner;

public class Quiz4_numbers_in_the_middle {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int num1, num2;
        num1 = scr.nextInt();
        num2 = scr.nextInt();

        int max = Math.max(num1,num2);
        int min = Math.min(num1,num2);

        while(true){
            System.out.println(min);
            min++;
            if(min>max) break;
        }
    }
}
