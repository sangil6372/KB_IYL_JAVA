package ch08.basic.sec02;

public class Audio implements RemoteControl{

    @Override
    public void turnOn() {
        System.out.println("오디오 키기");
    }
}
