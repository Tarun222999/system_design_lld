package abstractfactorypattern.abstractFactory;

import abstractfactorypattern.VehicalFactory;
import abstractfactorypattern.Vehicle;
import abstractfactorypattern.concretevehicles.Toyota;

public class ToyotaFactory implements VehicalFactory {
    public Vehicle createVehicle() {
        return new Toyota();
    }
}
