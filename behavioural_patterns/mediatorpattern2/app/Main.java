package mediatorpattern2.app;

import mediatorpattern2.concretemediator.MediatorDevice;
import mediatorpattern2.concretedevices.Alarm;
import mediatorpattern2.concretedevices.Light;
import mediatorpattern2.concretedevices.Fan;
import mediatorpattern2.concretedevices.Ac;
import mediatorpattern2.concretedevices.Lock;

public class Main {
    public static void main(String[] args) {
        // create mediator and devices
        MediatorDevice mediator = new MediatorDevice();
        Alarm alarm = new Alarm(mediator);
        Light light = new Light();
        Fan fan = new Fan();
        Ac ac = new Ac();
        Lock lock = new Lock();

        // register devices with the mediator
        mediator.registerDevice(alarm);
        mediator.registerDevice(light);
        mediator.registerDevice(fan);
        mediator.registerDevice(ac);
        mediator.registerDevice(lock);

        // simulate events
        System.out.println("=== Alarm event ===");
        alarm.trigger(); // alarm notifies mediator

        System.out.println("=== User leaves ===");
        mediator.userLeave(); // other events can still be invoked directly

        System.out.println("=== User enters ===");
        mediator.userEnter();
    }
}
