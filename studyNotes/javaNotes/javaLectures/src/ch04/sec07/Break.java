package ch04.sec07;

public class Break {
    public static void main(String[] args) {
        while (true) {
            int num = (int) (Math.random() * 6) + 1; //정수 1 ~ 6
            System.out.println(num);
            if (num == 1) break;
        }
    }
}
