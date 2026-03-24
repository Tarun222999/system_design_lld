package lldquestions.parkingstrategy;

import lldquestions.parkinglot.enums.VehicleType;
import lldquestions.parkinglot.enums.duration.DurationType;

public interface ParkingFeeStrategy {
    double calucalateFee(VehicleType vehicleType, int duration, DurationType dType);
}
