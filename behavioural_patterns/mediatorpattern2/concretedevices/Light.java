package mediatorpattern2.concretedevices;

import mediatorpattern2.idevice.IDevice;

public class Light implements IDevice {

    public void off() {
        System.out.println("Light off ");
    }

    public void on() {
        System.out.println("Light on");
    }
}