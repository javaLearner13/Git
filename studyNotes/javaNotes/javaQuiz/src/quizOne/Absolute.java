package quizOne;
import java.util.Scanner;
public class Absolute {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("enter an integer: ");
        int n = stdIn.nextInt();

        if(n>=0){
            System.out.println("abs value = "+n);
        }else{
            System.out.println("abs value = "+(-n));
        }

    }
}