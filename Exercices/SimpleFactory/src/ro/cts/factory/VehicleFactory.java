package ro.cts.factory;

import ro.cts.clase.Bike;
import ro.cts.clase.Car;
import ro.cts.clase.Scooter;
import ro.cts.clase.Vehicle;

public class VehicleFactory {
    public VehicleFactory() {
    }

    public Vehicle getVehicle(VehicleType type, float pret, String culoare, boolean isElectric){
        switch (type){
            case CAR -> {
                Vehicle car = new Car(pret, culoare, isElectric);
                car.calculeazaRata();
                return car;
            }
            case BIKE -> {
                Vehicle bike = new Bike(pret, culoare, isElectric);
                bike.calculeazaRata();
                return bike;
            }
            case SCOOTER -> {
                Vehicle scooter = new Scooter(pret, culoare);
                scooter.calculeazaRata();
                return scooter;
            }
            case null, default -> {
                return null;
            }
        }
    }

}
