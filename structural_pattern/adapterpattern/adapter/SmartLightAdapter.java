package adapter;

import concrete.SmartLight;
import idevice.IDevice;

// Adapter for Smart Light
public class SmartLightAdapter implements IDevice {
    private SmartLight smartLight;

    public SmartLightAdapter(SmartLight smartLight) {
        this.smartLight = smartLight;
    }

    @Override
    public void turnon() {
        smartLight.connectToWiFi();
        smartLight.switchOn();
    }

    @Override
    public void turnoff() {
        smartLight.switchOff();
        smartLight.disconnectWiFi();
    }
}