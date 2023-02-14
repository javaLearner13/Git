package homework.hw1;

public class MyVersionSwap extends MyVersion {
    public MyVersionSwap(MyVersion[] test) {
        int a = test[0].tot;
        int b = test[1].tot;
        int c = test[2].tot;
        test[0].rank = (a > c && a > b) ? 1 : a > c ? 2 : a > b ? 2 : 3;
        test[1].rank = (b > a && b > c) ? 1 : b > c ? 2 : b > a ? 2 : 3;
        test[2].rank = (c > a && c > b) ? 1 : c > b ? 2 : c > a ? 2 : 3;
    }

}
