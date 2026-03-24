package lldquestions.parkinglot.parkinglott;

import java.util.List;

import lldquestions.parkinglot.enums.VehicleType;
import lldquestions.parkinglot.parkingslot.ParkingSlot;
import lldquestions.parkinglot.parkingspot.ParkingSpot;
import lldquestions.parkinglot.vehicl.Vehicle;

public class ParkingLot {
    private List<ParkingSpot> parkingSpots;

    public ParkingLot(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public ParkingSpot findAvailableSpot(VehicleType vehicleType) {
        for (ParkingSpot spot : parkingSpots) {
            if (!spot.isOccupied() && spot.getSpotType().equals(vehicleType)) {
                return spot;
            }
        }

        return null;
    }

    public ParkingSpot parkVehicle(Vehicle vehicle) {
        ParkingSpot spot = findAvailableSpot(vehicle.getVehicleType());
        if (spot != null) {
            spot.parkVehicle(vehicle);
            System.out.println(
                    "Vehicle parked successfully in spot: " + spot.getSpotNumber());
            return spot;
        }
        System.out.println(
                "No parking spots available for " + vehicle.getVehicleType() + "!");
        return null;
    }

    // Method to vacate a parking spot
    public void vacateSpot(ParkingSpot spot, Vehicle vehicle) {
        if (spot != null && spot.isOccupied()
                && spot.getVehicle().equals(vehicle)) {
            spot.vacate(); // Free the spot
            System.out.println(vehicle.getVehicleType()
                    + " vacated the spot: " + spot.getSpotNumber());
        } else {
            System.out.println("Invalid operation! Either the spot is already vacant "
                    + "or the vehicle does not match.");
        }
    }

    public ParkingSpot getSpotByNumber(int spotNumber) {
        for (ParkingSpot spot : parkingSpots) {
            if (spot.getSpotNumber() == spotNumber) {
                return spot;
            }
        }
        return null; // Spot not found
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }
}
