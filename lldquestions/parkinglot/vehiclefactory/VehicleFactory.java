package lldquestions.parkinglot.vehiclefactory;

import lldquestions.parkinglot.concretvehicles.bike.BikeVehicle;
import lldquestions.parkinglot.concretvehicles.car.CarVehicle;
import lldquestions.parkinglot.concretvehicles.truck.TruckVehicle;
import lldquestions.parkinglot.enums.VehicleType;
import lldquestions.parkinglot.vehicl.Vehicle;
import lldquestions.parkingstrategy.ParkingFeeStrategy;

public class VehicleFactory {
    public static Vehicle createVehicle(String vehicleType, String licensePlate, ParkingFeeStrategy feeStrategy) {
        if (vehicleType.equalsIgnoreCase("Car")) {
            return new CarVehicle(licensePlate, VehicleType.CAR, feeStrategy);
        } else if (vehicleType.equalsIgnoreCase("Bike")) {
            return new BikeVehicle(licensePlate, VehicleType.BIKE, feeStrategy);
        }
        return new TruckVehicle(licensePlate, VehicleType.TRUCK, feeStrategy); // For unsupported vehicle types
    }
}
