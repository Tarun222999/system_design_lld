package factorypattern;

import factorypattern.concrete_vehicals.Bike;
import factorypattern.concrete_vehicals.Car;
import factorypattern.concrete_vehicals.Truck;

public class VehicleFactory {
    public static Vehicle getVehicle(String vehicleType) {
        if (vehicleType.equals("Car")) {
            return new Car();
        } else if (vehicleType.equals("Truck")) {
            return new Truck();
        } else if (vehicleType.equals("Bike")) {
            return new Bike();
        } else {
            throw new IllegalArgumentException("Unknown Vehicle Type");
        }
    }
}
