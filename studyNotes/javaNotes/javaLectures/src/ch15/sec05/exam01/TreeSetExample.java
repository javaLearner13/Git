package ch15.sec05.exam01;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();

        scores.add(87);
        scores.add(99);
        scores.add(78);
        scores.add(90);
        scores.add(80);

        for(Integer s : scores){
            System.out.print(s + " ");
        }
        System.out.println("\n");

        System.out.println("lowest score: " + scores.first());
        System.out.println("highest score: " + scores.last());
        System.out.println("above 90: " + scores.higher(90));
        System.out.println("below 95: " + scores.lower(95));
        System.out.println("equals to or below 95: " + scores.floor(95));
        System.out.println("equals to or above 96: " + scores.ceiling(96));
    }
}
