package ch00.sec02_1;

public class MyFunctionInterfaceExample {
    public static void main(String[] args) {

        MyFunctionInterface fi;
        fi = (x, y) ->{
            int result = x + y;
            return result;
        };

        System.out.println(fi.method(3,4));

    }
}
