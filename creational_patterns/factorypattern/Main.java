package factorypattern;

//have a centralized object create store (***factory)
public class Main {
    public static void main(String[] args) {
        Vehicle v1 = VehicleFactory.getVehicle("Truck");
        Vehicle v2 = VehicleFactory.getVehicle("Bike");
        Vehicle v3 = VehicleFactory.getVehicle("Car");

        v1.stop();
        v2.start();
        v3.stop();
    }
}
