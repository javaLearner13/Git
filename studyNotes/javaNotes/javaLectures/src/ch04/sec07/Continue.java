package ch04.sec07;

public class Continue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                continue; // 홀수면 밑에 건너뛰고 위에부터 다음꺼 진행
            }
            System.out.println(i + " ");
        }
        /*동일하지만 다른 방법*/
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i + " ");
        }


    }
}
