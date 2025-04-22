package ch09.basic.sec07.exam02;

public class Home {
    RemoteControl rc = new RemoteControl() {
        @Override
        public void turnOn() {
            System.out.println("전원 키기");
        }

        @Override
        public void turnOff() {
            System.out.println("전원 끄기");
        }
    };

    public void use1() {
        rc.turnOn();
        rc.turnOff();
    }
}
