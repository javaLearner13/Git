package ch00.sec02;

public class MyFunctionInterfaceExample {
    public static void main(String[] args) {

        MyFunctionInterface fi;
        fi = (x) ->{
            int result = x * 3;
            System.out.println(result);
        };
        fi.method(2);


    }
}
