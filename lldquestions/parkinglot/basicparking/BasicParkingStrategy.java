package lldquestions.parkinglot.basicparking;

import lldquestions.parkinglot.enums.VehicleType;
import lldquestions.parkinglot.enums.duration.DurationType;
import lldquestions.parkingstrategy.ParkingFeeStrategy;

public class BasicParkingStrategy implements ParkingFeeStrategy {
    public double calucalateFee(VehicleType vehicleType, int duration, DurationType durationType) {
        switch (vehicleType) {
            case CAR:
                return durationType == DurationType.HOURS
                        ? duration * 10.0 // $10 per hour for cars
                        : duration * 10.0 * 24; // Daily rate

            case BIKE:
                return durationType == DurationType.HOURS
                        ? duration * 5.0 // $5 per hour for bikes
                        : duration * 5.0 * 24; // Daily rate

            case TRUCK:
                return durationType == DurationType.HOURS
                        ? duration * 8.0 // $8 per hour for autos
                        : duration * 8.0 * 24; // Daily rate

            default:
                return durationType == DurationType.HOURS
                        ? duration * 15.0 // $15 per hour for other vehicles
                        : duration * 15.0 * 24; // Daily rate
        }
    }
}
