package lldquestions.parkinglot.concretvehicles.truck;

import lldquestions.parkinglot.enums.VehicleType;
import lldquestions.parkinglot.vehicl.Vehicle;
import lldquestions.parkingstrategy.ParkingFeeStrategy;

public class TruckVehicle extends Vehicle {
    public TruckVehicle(String licensePlate, VehicleType vehicleType, ParkingFeeStrategy feeStrategy) {
        super(licensePlate, vehicleType, feeStrategy);
    }
}
