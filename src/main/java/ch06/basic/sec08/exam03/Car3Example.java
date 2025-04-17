package ch06.sec08.exam03;

public class Car3Example {
    public static void main(String[] args) {
        Car3 car = new Car3();
        car.gas  = 5;

        car.isLeftGas();
        System.out.println("출발합니다.");
        car.run();
        System.out.println("gas를 주입하세요.");
    }
}
