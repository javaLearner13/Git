package quizOne;
import java.util.Scanner;

public class Negative {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("integer: ");
        int n = stdIn.nextInt();

        if(n<0){
            System.out.println("negative value");
        }else if(n==0){
            System.out.println("zero");
        }else{
            System.out.println("positive value");
        }
    }
}
