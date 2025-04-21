package ch08.basic.sec02;

public class Television implements RemoteControl{
    @Override
    public void turnOn() {
        System.out.println("TV 키기");
    }
}
