package quizTen;

import java.util.Scanner;

public class SumUp {

    static int sumUp(int n){
        int r = n-1;
        for(int i=1;i<=r;i++){
            n = n + i;
        }
        return n;
    }


    public static void main(String[] args) {
        System.out.println("enter a num: ");
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int ans = sumUp(n);
        System.out.println(ans);

    }






}