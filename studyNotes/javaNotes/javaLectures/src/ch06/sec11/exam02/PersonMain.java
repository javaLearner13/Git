package ch06.sec11.exam02;

import java.util.Scanner;

public class PersonMain {
    public static void main(String[] args) {

        Person psn = new Person();
        Scanner scr = new Scanner(System.in);
        System.out.print("enter the key to reveal my name (bye to exit loop): ");
        String input = scr.next();

        do {

            String hi = psn.getName(input);  //will only return true name if input is "key"
            System.out.println(hi); //return name

            System.out.print("enter the key to reveal my name (bye to exit loop): ");
            input = scr.next();

        }while(!"bye".equals(input));
    }
}
