package lldquestions.parkinglot.concretvehicles.car;

import lldquestions.parkinglot.enums.VehicleType;
import lldquestions.parkinglot.vehicl.Vehicle;
import lldquestions.parkingstrategy.ParkingFeeStrategy;

public class CarVehicle extends Vehicle {
    public CarVehicle(String licensePlate, VehicleType vehicleType, ParkingFeeStrategy feeStrategy) {
        super(licensePlate, vehicleType, feeStrategy);
    }
}
