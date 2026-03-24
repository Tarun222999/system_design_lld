package lldquestions.parkinglot.mainparking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lldquestions.parkinglot.basicparking.BasicParkingStrategy;
import lldquestions.parkinglot.concretespots.bikespot.BikeParkingSpot;
import lldquestions.parkinglot.concretespots.carspot.CarParkingSpot;
import lldquestions.parkinglot.enums.duration.DurationType;
import lldquestions.parkinglot.parkinglott.ParkingLot;
import lldquestions.parkinglot.parkingspot.ParkingSpot;
import lldquestions.parkinglot.paymentstrategy.IStrategy;
import lldquestions.parkinglot.paymentstrategy.concrete.cash.CashPayment;
import lldquestions.parkinglot.vehicl.Vehicle;
import lldquestions.parkinglot.vehiclefactory.VehicleFactory;
import lldquestions.parkingstrategy.ParkingFeeStrategy;

public class ParkingMain {
    public static void main(String[] args) {
        List<ParkingSpot> parkingSpots = new ArrayList<>();
        parkingSpots.add(new CarParkingSpot(1, "car"));
        parkingSpots.add(new BikeParkingSpot(2, "bike"));

        ParkingLot parkingLot = new ParkingLot(parkingSpots);
        // Create fee strategies
        ParkingFeeStrategy basicHourlyRateStrategy = new BasicParkingStrategy();
        Vehicle car1 = VehicleFactory.createVehicle("Car", "CAR123", basicHourlyRateStrategy);

        ParkingSpot carSpot = parkingLot.parkVehicle(car1);

        if (carSpot != null) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Select payment method for your vehicle:");
            System.out.println("1. Credit Card");
            System.out.println("2. Cash");

            int paymentMethod = sc.nextInt();

            if (carSpot != null) {
                double carFee = car1.calculateFee(paymentMethod, DurationType.HOURS);
                IStrategy carPaymentStrategy = getPaymentStrategy(paymentMethod, carFee);
                carPaymentStrategy.processPayment(carFee);
                parkingLot.vacateSpot(carSpot, car1);
            }
            sc.close();

        }

    }

    private static IStrategy getPaymentStrategy(
            int paymentMethod, double fee) {
        switch (paymentMethod) {

            case 2:
                return new CashPayment(fee);
            default:
                System.out.println("Invalid choice! Default to Credit card payment.");
                return new CashPayment(fee);
        }
    }

}
