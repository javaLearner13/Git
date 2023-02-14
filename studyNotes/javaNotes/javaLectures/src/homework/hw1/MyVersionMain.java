package homework.hw1;

public class MyVersionMain {
    public static void main(String[] args) {

        MyVersion[] test = new MyVersion[3];
        test[0] = new MyVersion(1, "홍길동", 98, 90, 77, 68);
        test[1] = new MyVersion(2, "임꺽정", 77, 87, 99, 99);
        test[2] = new MyVersion(3, "신돌석", 88, 67, 83, 79);

        MyVersionOutput output = new MyVersionOutput(test);
        MyVersionSwap swap = new MyVersionSwap(test);
        System.out.println("======== 결과 ========");
        MyVersionOutput output2 = new MyVersionOutput(test);

    }
}