package interfaceEx;

import ch08.sec03.RemoteController;

public class Audio implements RemoteControl{
//    fields
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("audio on");
    }

    @Override
    public void turnOff() {
        System.out.println("audio off");
    }

    @Override
    public void setVolume(int volume) {
//        this.volume = volume;
    if(volume> RemoteControl.MAX_VOLUME){
        this.volume = RemoteControl.MAX_VOLUME;
    }else if(volume<RemoteControl.MIN_VOLUME){
        this.volume = RemoteControl.MIN_VOLUME;
    }else{
        this.volume = volume;
    }

        System.out.println("current AUDIO volume: "+volume);

    }

    private int memoryVolume;

    @Override
    public void setMute(boolean mute) {
//        RemoteControl.super.setMute(mute);
        if(mute) {
            this.memoryVolume = this.volume;
            System.out.println("muted");
            setVolume(RemoteControl.MIN_VOLUME);
        }else{
            System.out.println("mute canceled");
            setVolume(this.memoryVolume);
        }
    }
}
