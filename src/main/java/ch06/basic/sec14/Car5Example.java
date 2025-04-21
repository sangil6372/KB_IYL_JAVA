package ch06.basic.sec14;

public class Car5Example {
    public static void main(String[] args) {
        Car5 car = new Car5();
        car.setSpeed(-50);
        System.out.println("현재 속도: " + car.getSpeed());
        car.setSpeed(60);
        System.out.println("현재 속도: " + car.getSpeed());
        car.setStop(true);
        System.out.println("현재 속도: " + car.getSpeed());

    }
}
