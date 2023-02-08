package quizTwo;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz8_ascending {
    public static void main(String[] args) {
        int num1,num2,num3;
        Scanner scr = new Scanner(System.in);
        num1=scr.nextInt();
        num2=scr.nextInt();
        num3=scr.nextInt();
        int[] arr = {num1,num2,num3};
        Arrays.sort(arr);
        System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
    }
}
