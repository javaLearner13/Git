package ch07.sec02;

public class Phone {
    //field
    public String model;
    public String color;

    //method
    public void bell(){
        System.out.println("bell rings");
    }
    public void sendVoice(String message){
        System.out.println("your message: "+message);
    }
    public void receiveVoice(String message){
        System.out.println("recipient message: "+message);
    }
    public void hangUp(){
        System.out.println("call ended.");
    }
}
