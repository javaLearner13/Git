package quizTwo;
//import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;
public class Quiz5_find_center {
    public static void main(String[] args) {
        /*
        * get 3 integers and return 2nd largest/smallest value
        * */
        Scanner scr = new Scanner(System.in);

        int num1 = scr.nextInt();
        int num2 = scr.nextInt();
        int num3 = scr.nextInt();
        int[] arr = {num1, num2, num3};
        Arrays.sort(arr);
        System.out.println(arr[1]);

    }
}
