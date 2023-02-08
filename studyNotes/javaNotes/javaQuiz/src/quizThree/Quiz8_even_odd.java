package quizThree;

import java.util.Scanner;

public class Quiz8_even_odd {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int input = scr.nextInt();
        int count = 1;
        if(input>0){
            do {
                if(count%2==1){
                    System.out.print("*");
                }else{
                    System.out.print("+");
                }
                count++;
            }while(count<=input);
        }
    }
}
