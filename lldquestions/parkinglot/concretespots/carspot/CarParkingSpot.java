package lldquestions.parkinglot.concretespots.carspot;

import lldquestions.parkinglot.enums.VehicleType;
import lldquestions.parkinglot.parkingspot.ParkingSpot;
import lldquestions.parkinglot.vehicl.Vehicle;

public class CarParkingSpot extends ParkingSpot {
    public CarParkingSpot(int spotNumber, String spotType) {
        super(spotNumber, spotType);
    }

    public boolean canParkVehicle(Vehicle vehicle) {
        return VehicleType.CAR == vehicle.getVehicleType();
    }
}
