package lldquestions.parkinglot.vehicl;

import lldquestions.parkinglot.enums.VehicleType;
import lldquestions.parkinglot.enums.duration.DurationType;
import lldquestions.parkingstrategy.ParkingFeeStrategy;

public abstract class Vehicle {
    protected String licensePlate;
    protected VehicleType vehicleType;
    private ParkingFeeStrategy feeStrategy;

    public Vehicle(String licensePlate, VehicleType vehicleType, ParkingFeeStrategy feeStrategy) {
        this.licensePlate = licensePlate;
        this.vehicleType = vehicleType;
        this.feeStrategy = feeStrategy;
    }

    // Getter method to retrieve the vehicle type
    public VehicleType getVehicleType() {
        return vehicleType;
    }

    // Getter method to retrieve the vehicle's license plate number
    public String getLicensePlate() {
        return licensePlate;
    }

    // Method to calculate parking fee based on duration and duration type
    public double calculateFee(int duration, DurationType durationType) {
        return feeStrategy.calucalateFee(vehicleType, duration, durationType);
    }
}
