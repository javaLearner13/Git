package homework.hw1;
class Subject {
    String name;
    int no;
    int kor;
    int eng;
    int tot;
    int avg;
    int rank;
    char point;
    public Subject(String name, int no, int kor, int eng) {
        this.name = name;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
    }
}

public class Homework01 {
    public static void main(String[] args) {
        Subject[] sub = new Subject[3];
        sub[0] = new Subject("홍길동", 1, 98, 90);
        sub[1] = new Subject("임꺽정", 2, 76, 55);
        sub[2] = new Subject("신돌석", 3, 85, 73);

        for (int i = 0; i < sub.length; i++) {
            sub[i].tot = sub[i].kor + sub[i].eng;
            sub[i].avg = sub[i].tot / 2;
//            sub[i].rank = 1;

            if (sub[i].avg >= 90) {
                sub[i].point = 'A';
            } else if (sub[i].avg >= 80) {
                sub[i].point = 'B';
            } else if (sub[i].avg >= 70) {
                sub[i].point = 'C';
            } else if (sub[i].avg >= 60) {
                sub[i].point = 'D';
            } else {
                sub[i].point = 'F';
            }

            sub[i].rank = 1;
        }
        System.out.println("************* 성적표 **************");
        System.out.println("이름\t학번\t국어\t영어\t총점\t평균\t학점\t등수");
        System.out.println("==================================");

        for (int i = 0; i < sub.length; i++) {
            System.out.println(sub[i].name + "\t" + sub[i].no + "\t" + sub[i].kor + "\t" +sub[i].eng + "\t" + sub[i].tot + "\t" + sub[i].avg + "\t" + sub[i].point + "\t" + sub[i].rank);
        }
        for (int row = 0; row < sub.length - 1; row++) {
            for (int col = row + 1; col < sub.length; col++) {
                if (sub[row].avg < sub[col].avg) {
                    Subject temp = sub[row];
                    sub[row] = sub[col];
                    sub[col] = temp;
                }

                if (sub[row].avg < sub[col].avg) {
                    sub[row].rank = sub[row].rank + 1;
                } else if (sub[row].avg > sub[col].avg) {
                    sub[col].rank = sub[col].rank + 1;
                }
            }
        }
        System.out.println();
        System.out.println("************* 결 과 ***************");

        System.out.println("학번\t이름\t국어\t영어\t총점\t평균\t학점\t등수");
        System.out.println("==================================");

        int i = 0; int d = 0;
        while(true){
            if(d>2) break;
            System.out.println(sub[i].no + "\t" + sub[i].name + "\t" + sub[i].kor + "\t" + sub[i].eng + "\t" + sub[i].tot + "\t" + sub[i].avg + "\t" + sub[i].point + "\t" + sub[i].rank);
            d++;
            if(i == 0) {
                i = 2;

            }else if(i == 2) {
                i = 1;

            }





        }

        }
    }

