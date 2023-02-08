package ch05.sec06;

public class function1 {
    public static void main(String[] args) {
        int[] scores;
        scores = new int[] {83, 90, 87};

        int sum1 = 0;
        for(int i=0;i<3;i++){
            sum1+=scores[i];
        }
        System.out.println("total: "+sum1);

        printItem(scores);

    }
    public static void printItem(int[] scores) {
        for (int i = 0; i < 3; i++) {
            System.out.println("score[" + i + "]: " + scores[i]);
        }
    }

}
