package ch07.sec02;

public class SmartphoneMain {
    public static void main(String[] args) {
        Smartphone myPhone = new Smartphone("galaxy", "gold");
        System.out.println("model: "+myPhone.model);
        System.out.println("color: "+myPhone.color);
        System.out.println("wifi status: "+myPhone.wifi);
        System.out.println();

        myPhone.bell();
        myPhone.sendVoice("hello?");
        myPhone.receiveVoice("wussup");
        myPhone.sendVoice("yo");
        myPhone.hangUp();

        myPhone.setWifi(true);
        myPhone.internet();
    }
}
