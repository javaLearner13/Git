package interfaceEx;

public interface RemoteControl {
    //fields
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    //abstract methods
    void turnOn();
    void turnOff();
    void setVolume(int volume);

    default void setMute(boolean mute){
        if(mute){
            System.out.println("muted");
            setVolume(MIN_VOLUME);
        }else{
            System.out.println("mute cancel");
        }
    }

}
