package adapter;

import concrete.AirConditioner;
import idevice.IDevice;

// Adapter for Air Conditioner
public class AirConditionerAdapter implements IDevice {
    private AirConditioner airConditioner;

    // Constructor
    public AirConditionerAdapter(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    public void turnon() {
        airConditioner.connectViaBluetooth();
        airConditioner.startCooling();
    }

    public void turnoff() {
        airConditioner.stopCooling();
        airConditioner.disconnectBluetooth();
    }
}