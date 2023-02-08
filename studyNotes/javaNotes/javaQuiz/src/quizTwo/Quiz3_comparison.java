package quizTwo;
import java.util.Scanner;
//import java.math.MathContext;
import static java.lang.Math.abs;

public class Quiz3_comparison {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        /*two integers
        * diff equals to or less than 10?
        * or bigger than 10?
        * */

        int num1 = scnr.nextInt();
        int num2 = scnr.nextInt();
        boolean diff = abs(num1-num2)<=10?true:false;
        if(diff){
            System.out.println("10 or lower");
        }else{
            System.out.println("bigger than 10");
        }

    }
}
