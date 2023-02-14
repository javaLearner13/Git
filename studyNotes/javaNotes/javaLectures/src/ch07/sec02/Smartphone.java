package ch07.sec02;

public class Smartphone extends Phone{
    //field
    public boolean wifi;
    //constructor
    public Smartphone(String model, String color){
      this.model = model;
      this.color = color;
    };
    //method
    public void setWifi(boolean wifi){
        this.wifi = wifi;
        System.out.println("wifi status change");
    }
    public void internet(){
        System.out.println("connecting to internet..");
    }
}
