package quizTen;

import java.util.Scanner;

public class ReturnShape {


/* take-in a character and a number to print n rows of that character */
static char getChar(){
    Scanner scr = new Scanner(System.in);
    System.out.print("enter a character: ");
    String temp = scr.next();
    char a = temp.charAt(0);
    return a;
}

static int getNum(){
    Scanner scr = new Scanner(System.in);
    System.out.print("enter a number: ");
    int n = scr.nextInt();
    return n;
}

static void returnShape(char a, int n){
    for(int i=0;i<n;i++){
        int d = 0;
        while(true){
            System.out.print(a);
            d++;
            if(d>i) break;
        }
        System.out.println();
    }
}

static void returnShape2(char a, int n){
    for(int i=0;i<n;i++){
        int d = 0;
        while(true){
            System.out.print(a);
            d++;
            if(d>3) break;
        }
        System.out.println();
    }
}

    public static void main(String[] args) {
    char a = getChar();
    int n = getNum();
    returnShape(a, n);
    returnShape2(a, n);

    }
}
