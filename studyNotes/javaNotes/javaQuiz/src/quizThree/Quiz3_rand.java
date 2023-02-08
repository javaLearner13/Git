package quizThree;

import java.util.Random;
import java.util.Scanner;

public class Quiz3_rand {
    public static void main(String[] args) {
        int guess;
        int randNum;
        Random rand = new Random();
        randNum = rand.nextInt(90) + 10; //10~99
        Scanner scr = new Scanner(System.in);
//        System.out.println(randNum);
        while(true){
            guess = scr.nextInt();
            if(guess==randNum){
                System.out.println("good job");
                break;
            }
            System.out.println("try again");
        }



    }
}
