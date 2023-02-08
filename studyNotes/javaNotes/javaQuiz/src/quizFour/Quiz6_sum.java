package quizFour;

import java.util.Scanner;

public class Quiz6_sum {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        int n = scr.nextInt();

        int count = 1;
        int sum = 0;
//        System.out.println("test");
        while(true){
            System.out.print(count+"+");
            sum += count;
            count++;

            if(count>=n) break;
        }
        sum+= count;
//        System.out.println("test2");
//        System.out.print();
        System.out.print(count+"="+sum);

    }
}
