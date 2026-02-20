package mediatorpattern2.concretedevices;

import mediatorpattern2.idevice.IDevice;

public class Lock implements IDevice {

    public void off() {
        System.out.println("Lock off ");
    }

    public void on() {
        System.out.println("Lock on");
    }
}
