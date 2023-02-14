package homework.hw1;

public class MyVersion {

    int no;
    String name;
    int kor, eng, sci, mat, tot, avg;
    char grade;
    int rank;

    public MyVersion(int no, String name, int kor, int eng, int sci, int mat) {
        this.no = no;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.sci = sci;
        this.mat = mat;
        this.tot = kor + eng + sci + mat;
        this.avg = this.tot / 4;
        if (avg >= 90) {
            this.grade = 'A';
        } else if (avg >= 80) {
            this.grade = 'B';
        } else if (avg >= 70) {
            this.grade = 'C';
        } else if (avg >= 60) {
            this.grade = 'D';
        } else {
            this.grade = 'F';
        }
    }

    public MyVersion() {
    }

}