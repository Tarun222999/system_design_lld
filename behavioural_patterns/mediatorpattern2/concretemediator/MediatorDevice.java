package mediatorpattern2.concretemediator;

import java.util.ArrayList;
import java.util.List;

import mediatorpattern2.imediator.Mediator;
import mediatorpattern2.idevice.IDevice;
import mediatorpattern2.concretedevices.Ac;
import mediatorpattern2.concretedevices.Alarm;
import mediatorpattern2.concretedevices.Fan;
import mediatorpattern2.concretedevices.Light;
import mediatorpattern2.concretedevices.Lock;

public class MediatorDevice implements Mediator {

    private final List<IDevice> devices = new ArrayList<>();

    /* registration */
    public void registerDevice(IDevice d) {
        devices.add(d);
    }

    /* convenience getters */
    public List<Light> lights() {
        List<Light> result = new ArrayList<>();
        for (IDevice d : devices) {
            if (d instanceof Light) {
                result.add((Light) d);
            }
        }
        return result;
    }

    public List<Fan> fans() {
        List<Fan> result = new ArrayList<>();
        for (IDevice d : devices) {
            if (d instanceof Fan) {
                result.add((Fan) d);
            }
        }
        return result;
    }

    public Ac ac() {
        for (IDevice d : devices) {
            if (d instanceof Ac) {
                return (Ac) d;
            }
        }
        return null;
    }

    public Lock doorLock() {
        for (IDevice d : devices) {
            if (d instanceof Lock) {
                return (Lock) d;
            }
        }
        return null;
    }

    public Alarm alarm() {
        for (IDevice d : devices) {
            if (d instanceof Alarm) {
                return (Alarm) d;
            }
        }
        return null;
    }

    public void alarmTriggered() {
        // when Alaram goes off: lights on, doors lock, ac off
        lights().forEach(IDevice::on);
        Lock lock = doorLock();
        if (lock != null)
            lock.on();
        Ac a = ac();
        if (a != null)
            a.off();
    }

    @Override
    public void userEnter() {
        // user enters: unlock doors, turn on lights
        Lock lock = doorLock();
        if (lock != null)
            lock.off();
        lights().forEach(IDevice::on);
    }

    @Override
    public void userLeave() {
        // user leaves: turn off lights, fan, ac; lock doors
        lights().forEach(IDevice::off);
        fans().forEach(IDevice::off);
        Ac a = ac();
        if (a != null)
            a.off();
        Lock lock = doorLock();
        if (lock != null)
            lock.on();
    }
}
