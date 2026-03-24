package lldquestions.parkinglot.concretespots.truckspot;

import lldquestions.parkinglot.enums.VehicleType;
import lldquestions.parkinglot.parkingspot.ParkingSpot;
import lldquestions.parkinglot.vehicl.Vehicle;

public class TruckSpot extends ParkingSpot {
    public TruckSpot(int spotNumber, String spotType) {
        super(spotNumber, spotType);
    }

    public boolean canParkVehicle(Vehicle vehicle) {
        return VehicleType.TRUCK == vehicle.getVehicleType();
    }

}
