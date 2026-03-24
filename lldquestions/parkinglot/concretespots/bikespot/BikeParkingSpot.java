package lldquestions.parkinglot.concretespots.bikespot;

import lldquestions.parkinglot.enums.VehicleType;
import lldquestions.parkinglot.parkingspot.ParkingSpot;
import lldquestions.parkinglot.vehicl.Vehicle;

public class BikeParkingSpot extends ParkingSpot {
    public BikeParkingSpot(int spotNumber, String spotType) {
        super(spotNumber, spotType);
    }

    public boolean canParkVehicle(Vehicle vehicle) {
        return VehicleType.BIKE == vehicle.getVehicleType();
    }
}
