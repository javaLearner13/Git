package ch05.sec05;

public class EmptyString {
    public static void main(String[] args) {
        String hobby = "";
        if(hobby.equals("")){
            System.out.println("참조는 String, 객체는 빈 문자열");
        }
    }
}
