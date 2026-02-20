package mediatorpattern2.concretedevices;

import mediatorpattern2.idevice.IDevice;
import mediatorpattern2.imediator.Mediator;

public class Alarm implements IDevice {
    private Mediator mediator;

    public Alarm(Mediator mediator) {
        this.mediator = mediator;
    }

    public void off() {
        System.out.println("Alarm off ");
    }

    public void on() {
        System.out.println("Alarm on");
        if (mediator != null) {
            mediator.alarmTriggered();
        }
    }

    /**
     * trigger the alarm without changing its on/off state
     * useful for simulating a sensor event.
     */
    public void trigger() {
        System.out.println("Alarm triggered!");
        if (mediator != null) {
            mediator.alarmTriggered();
        }
    }
}