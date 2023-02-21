package ch00.sec01;

public class MyFunctionInterfaceExample {
    public static void main(String[] args) {

        MyFunctionInterface fi;
        fi = () ->{
            String str = "method call";
            System.out.println(str);
        };

        fi.method();

        fi = () ->{
            System.out.println("method call 2");
        };

        fi.method();

        fi = () -> System.out.println("method call 3");

        fi.method();

    }
}
