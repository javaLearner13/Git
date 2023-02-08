package ch05.sec05;

public class CharAt {
    public static void main(String[] args) {
        String ssn = "9506242230123";
        char sex = ssn.charAt(6);
        switch(sex){
            case '1':
            case '3':
                System.out.println("male");
                break;
            case '2':
            case '4':
                System.out.println("female");
        }
    }
}
