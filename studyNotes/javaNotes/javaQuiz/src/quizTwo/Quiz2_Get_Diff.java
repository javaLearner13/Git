package quizTwo;
import java.util.Scanner;
public class Quiz2_Get_Diff {
    public static void main(String[] args) {
        //get two integers and get difference
        /*get max val
        * subtract
        * */
        int val1, val2;
        Scanner scnr = new Scanner(System.in);
        val1=scnr.nextInt();
        val2=scnr.nextInt();
//        max=val1>val2?val1:val2;
        int diff = val1>val2?val1-val2:val2-val1;
        System.out.println(diff);
    }
}
