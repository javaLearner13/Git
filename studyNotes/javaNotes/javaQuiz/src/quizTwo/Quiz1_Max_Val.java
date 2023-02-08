package quizTwo;

import java.util.Scanner;

/*get max val*/
public class Quiz1_Max_Val {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("real number a: ");
        double a = stdIn.nextDouble();
        System.out.print("real number b: ");
        double b = stdIn.nextDouble();

        double max = a;
        if (b > a) max = b;

        //or
        /*
         *   double max = a > b ? a : b;
         *
         * */

        System.out.println("max number is " + max);
    }
}
