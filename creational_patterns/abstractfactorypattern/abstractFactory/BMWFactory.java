package abstractfactorypattern.abstractFactory;

import abstractfactorypattern.VehicalFactory;
import abstractfactorypattern.Vehicle;
import abstractfactorypattern.concretevehicles.BMW;

public class BMWFactory implements VehicalFactory {
    public Vehicle createVehicle() {
        return new BMW();
    }
}
