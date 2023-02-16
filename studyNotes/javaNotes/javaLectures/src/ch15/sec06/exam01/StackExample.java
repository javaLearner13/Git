package ch15.sec06.exam01;

import java.util.Stack;
//STACK = LIFO method 1 2 3 4 - > 4 3 2 1
public class StackExample {
    public static void main(String[] args) {
        Stack<Coin> coinBox = new Stack<>();

        coinBox.push(new Coin(100));
        coinBox.push(new Coin(50));
        coinBox.push(new Coin(500));
        coinBox.push(new Coin(10));

        while(!coinBox.empty()){
            Coin coin = coinBox.pop();
            System.out.println("coins taken out: "+coin.getValue()+"won");
        }

    }
}
