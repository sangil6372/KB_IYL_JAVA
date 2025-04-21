package ch07.basic.sec08;

public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Bus bus = new Bus();

        Taxi taxi = new Taxi();

        bus.run();
        taxi.run();
    }
}
