package lldquestions.parkinglot.concretvehicles.bike;

import lldquestions.parkinglot.enums.VehicleType;
import lldquestions.parkinglot.vehicl.Vehicle;
import lldquestions.parkingstrategy.ParkingFeeStrategy;

public class BikeVehicle extends Vehicle {
    public BikeVehicle(String licensePlate, VehicleType vehicleType, ParkingFeeStrategy feeStrategy) {
        super(licensePlate, vehicleType, feeStrategy);
    }
}
