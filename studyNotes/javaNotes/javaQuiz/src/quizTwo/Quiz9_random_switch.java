package quizTwo;

import java.util.Random;

public class Quiz9_random_switch {
    public static void main(String[] args) {

        Random rand = new Random();

        int val = rand.nextInt(3);
        System.out.println("rand seed: " + val);

        switch (val){
            case 0:
                System.out.println("scissors"); break;
            case 1:
                System.out.println("rock"); break;
            case 2:
                System.out.println("paper"); break;
            default:
                System.out.println("error");
        }



    }
}
