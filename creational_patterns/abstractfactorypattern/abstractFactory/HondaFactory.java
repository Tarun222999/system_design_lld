package abstractfactorypattern.abstractFactory;

import abstractfactorypattern.VehicalFactory;
import abstractfactorypattern.Vehicle;
import abstractfactorypattern.concretevehicles.Honda;

public class HondaFactory implements VehicalFactory {

    public Vehicle createVehicle() {
        return new Honda();
    }
}
