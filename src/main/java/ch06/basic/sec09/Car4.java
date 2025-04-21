package ch06.basic.sec09;

public class Car4 {
    String model;
    int speed;

    public Car4 (String model){
        this.model = model;
    }


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void run(){
        System.out.printf(model + "가 달립니다.(시속: %dkm/h)", speed);
    }
}
