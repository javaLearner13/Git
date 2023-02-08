package ch06.sec11.exam02;

public class Person {

    private int age;
    private String name = "You got me";


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName(String lock) {
        // can restrict the code without displaying data to user
        //restricted user check
        if (!"key".equals(lock)) {
            return "wrong key! access denied.";//returning null because the user is not supposed to view the data
        }
        return name;
    }

}