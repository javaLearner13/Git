package ch15.sec02.exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Board> list = new ArrayList<>();

        list.add(new Board("subject1", "content1", "author1"));
        list.add(new Board("subject2", "content2", "author2"));
        list.add(new Board("subject3", "content3", "author3"));
        list.add(new Board("subject4", "content4", "author4"));
        list.add(new Board("subject5", "content5", "author5"));

        int size = list.size();
        System.out.println("num of objects: "+size);
        System.out.println();
    }
}
