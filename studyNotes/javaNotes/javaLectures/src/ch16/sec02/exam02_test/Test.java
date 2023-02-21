package ch16.sec02.exam02_test;

public class Test {
    static int add(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        int sum = add(3, 5);
        System.out.println("sum = " + sum);
    }
}
