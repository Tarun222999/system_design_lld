package mediatorpattern2.concretedevices;

import mediatorpattern2.idevice.IDevice;

public class Ac implements IDevice {

    public void off() {
        System.out.println("AC off ");
    }

    public void on() {
        System.out.println("AC on");
    }
}