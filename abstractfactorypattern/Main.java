package abstractfactorypattern;

import abstractfactorypattern.abstractFactory.BMWFactory;
import abstractfactorypattern.abstractFactory.HondaFactory;

public class Main {
    public static void main(String[] args) {
        VehicalFactory hondaFactory = new HondaFactory();
        Vehicle honda = hondaFactory.createVehicle();
        honda.start();
        VehicalFactory bmwFactory = new BMWFactory();
        Vehicle bmw = bmwFactory.createVehicle();
        bmw.stop();
    }
}
