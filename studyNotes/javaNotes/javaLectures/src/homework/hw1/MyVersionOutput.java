package homework.hw1;

public class MyVersionOutput {
    public MyVersionOutput(MyVersion test[]) {
        System.out.println("No\t이름\t\t국어\t영어\t과학\t수학\t총점\t평균\t등급\t등수");
        for (int i = 0; i < 3; i++) {
            System.out.println(test[i].no + "\t" + test[i].name + "\t" + test[i].kor + "\t" + test[i].eng + "\t" + test[i].sci + "\t" + test[i].mat + "\t" + test[i].tot + "\t" + test[i].avg + "\t" + test[i].grade + "\t" + test[i].rank);
        }
    }
}
