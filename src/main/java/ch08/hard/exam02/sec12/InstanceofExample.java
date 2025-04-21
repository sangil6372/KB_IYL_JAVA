package ch08.hard.exam02.sec12;

public class InstanceofExample {
    public static void main(String[] args) {
        Taxi taxi = new Taxi();
        Bus bus = new Bus();

        ride(taxi);
        System.out.println();
        ride(bus);
    }

    private static void ride(Vehicle vehicle) {

        if (vehicle instanceof Bus bus){
            bus.checkFare();
        }
        vehicle.run();
    }
}
