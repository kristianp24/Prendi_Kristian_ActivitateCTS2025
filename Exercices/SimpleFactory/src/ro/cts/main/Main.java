package ro.cts.main;

import ro.cts.clase.Vehicle;
import ro.cts.factory.VehicleFactory;
import ro.cts.factory.VehicleType;

public class Main {
    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory();
        Vehicle car = factory.getVehicle(VehicleType.CAR, 5000f, "Red", true);
        Vehicle bike = factory.getVehicle(VehicleType.BIKE, 1000f, "Blue", true);
        Vehicle scooter = factory.getVehicle(VehicleType.SCOOTER, 1500f, "Green", true);
        System.out.println(car);
        System.out.println(bike);
        System.out.println(scooter);

    }
}