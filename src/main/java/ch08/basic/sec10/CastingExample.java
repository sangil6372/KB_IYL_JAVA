package ch08.basic.sec10;

public class CastingExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();

        vehicle.run();
        //vehicle.checkFare(); (x)

        Bus bus = (Bus) vehicle;
        bus.run();
        bus.checkFare();

    }
}
