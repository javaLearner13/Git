package quizTen;

import java.util.Scanner;

public class PrintSeason {

    static String returnSeason(int n){
//        String ans = "a";
        switch (n) {
//            case 3: case 4: case 5: ans = ans.replace("a", "Spring"); break;
////            System.out.println("Spring"); break;
//            case 6: case 7: case 8: ans = ans.replace("a", "Summer"); break;
//            case 9: case 10: case 11: ans = ans.replace("a", "Fall"); break;
//            case 12: case 1: case 2: ans = ans.replace("a", "Winter"); break;
//            default: return null;
            case 3: case 4: case 5: return "Spring";
            case 6: case 7: case 8: return "Summer";
            case 9: case 10: case 11: return "Fall";
            case 12: case 1: case 2: return "Spring";

        }
//        return ans;
        return null;
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("what month (number): ");
        int n = scr.nextInt();
//        String result = returnSeason(n);
        System.out.println(returnSeason(n));
    }
}
