package mediatorpattern2.concretedevices;

import mediatorpattern2.idevice.IDevice;

public class Fan implements IDevice {

    public void off() {
        System.out.println("Fan off ");
    }

    public void on() {
        System.out.println("Fan on");
    }
}