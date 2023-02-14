package interfaceEx;

public class RemoteControlMain {
    public static void main(String[] args) {
//        interface variable declaration
        RemoteControl rc;

//        using Television object through interface
        rc = new Television();
        rc.turnOn();
        rc.setVolume(5);
//        rc.turnOff();
        rc.setMute(true);
        rc.setMute(false);
//        using Audio object through interface
        /*rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();*/
        System.out.println();

        rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);

        rc.setMute(true);
        rc.setMute(false);

    }
}
