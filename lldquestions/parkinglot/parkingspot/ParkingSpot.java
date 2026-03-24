package lldquestions.parkinglot.parkingspot;

import lldquestions.parkinglot.vehicl.Vehicle;

public abstract class ParkingSpot {
    private int spotNumber;
    private boolean isOccupied;
    private Vehicle vehicle;
    private String spotType;

    public ParkingSpot(int spotNumber, String spotType) {
        this.spotNumber = spotNumber;
        this.isOccupied = false;
        this.spotType = spotType;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    // abstract method to check if vehicle can be park in spot
    public abstract boolean canParkVehicle(Vehicle vehicle);

    public void parkVehicle(Vehicle vehicle) {
        if (isOccupied) {
            throw new IllegalStateException("Spot is already occupied");
        }

        if (!canParkVehicle(vehicle)) {
            throw new IllegalArgumentException(
                    "This spot is not suitable for" + vehicle.getVehicleType());
        }

        this.vehicle = vehicle;
        this.isOccupied = true;
    }

    // Method to vacate the parking spot
    public void vacate() {
        // Check if the spot is already vacant
        if (!isOccupied) {
            throw new IllegalStateException("Spot is already vacant.");
        }
        this.vehicle = null;
        this.isOccupied = false;
    }

    // Getter for spot number
    public int getSpotNumber() {
        return spotNumber;
    }

    // Getter for the vehicle parked in the spot
    public Vehicle getVehicle() {
        return vehicle;
    }

    // Getter for spot type
    public String getSpotType() {
        return spotType;
    }
}
