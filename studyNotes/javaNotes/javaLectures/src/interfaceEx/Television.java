package interfaceEx;

public class Television implements RemoteControl {
    //    fields
    private int volume;

    //    turnOn() abstract method overriding
    @Override
    public void turnOn() {
        System.out.println("TV on");
    }

    // turnOff() abstract method overriding
    @Override
    public void turnOff() {
        System.out.println("TV off");
    }

    // setVolume abstract method overriding
    @Override
    public void setVolume(int volume) {
//        this.volume = volume;
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }

        System.out.println("current TV volume: " + volume);

    }
}
