package ch03.sec11;

import java.util.Scanner;

class Score1 {
    public static void getScore() {
        Scanner scr = new Scanner(System.in);    
        int yourScore = scr.nextInt();
        System.out.println("you entered " + yourScore);
        returnScore(yourScore);
    }

    public static void returnScore(int num) {
        char grade = (num > 90) ? 'A' : ((num > 80) ? 'B' : (num > 70) ? 'C' : 'D');
        System.out.println("your grade is " + grade);
//        return grade;
    }
}

public class FunctionExample {
    public static void main(String[] args) {
        
        Score1.getScore();
//        System.out.println("your score: "+score);
    }
}
