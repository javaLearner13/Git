package ch07.sec04.ex;

public class OverridingEx {
    public static void main(String[] args) {
        Person person = new Person();
        Child child = new Child();
        Senior senior = new Senior();

        person.cry();
        child.cry();
        senior.cry();

    }
}

class Person{
    void cry(){
        System.out.println("흑흑");
    }
}

class Child extends Person{
    @Override
    void cry(){
        System.out.println("잉잉");
    }
}

class Senior extends Person{
    @Override
    void cry(){
        System.out.println("훌쩍훌쩍");
    }
}