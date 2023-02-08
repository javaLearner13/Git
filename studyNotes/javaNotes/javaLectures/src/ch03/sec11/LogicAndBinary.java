package ch03.sec11;

public class LogicAndBinary {
    public static void main(String[] args) {

        /*논리연산자*/
        boolean a, b;
        a = true;
        b = true;
        System.out.println(a && b); //true
        System.out.println(a || b); //true
        System.out.println(a == b); //true
        System.out.println(a != b); //false
        System.out.println(!a == b); //false
        System.out.println(!a == !b); //true

        /*비트연산자*/
        int c = 15; /* 1 1 1 1 */
        int d = 8;  /* 1 0 0 0*/
        System.out.println(c & d); /* 1 0 0 0 */ /* 8 */
        System.out.println(c | d); /* 1 1 1 1 */ /* 15 */
        System.out.println(~c); /* 설명 X */ /* -16 */
        System.out.println(c ^= d); /* 0 1 1 1 */ /* 7 */



    }
}
