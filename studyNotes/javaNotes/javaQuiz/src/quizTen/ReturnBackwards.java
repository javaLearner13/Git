package quizTen;

import java.util.Scanner;

public class ReturnBackwards {

    static int n;
    static Scanner scr = new Scanner(System.in);
    static void getNumber(){
        System.out.print("what's ur number: ");
        n = scr.nextInt();
    }
    static int returnNumber(int n){
        while(n>0){

        }
        return n;
    }

    public static void main(String[] args) {
        getNumber();
        returnNumber(n);

    }
}
