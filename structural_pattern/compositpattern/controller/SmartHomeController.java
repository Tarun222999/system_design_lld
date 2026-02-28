package controller;

import composite.CompositeComponent;
import concrete.AirConditioner;
import concrete.SmartLight;
import icomponent.SmartComponent;

public class SmartHomeController {
    public static void main(String[] args) {
        SmartComponent airConditioner = new AirConditioner();
        SmartComponent smartLight = new SmartLight();

        CompositeComponent room1 = new CompositeComponent();
        room1.addComponent(smartLight);
        room1.addComponent(airConditioner);

        CompositeComponent room2 = new CompositeComponent();
        room2.addComponent(new SmartLight());
        room2.addComponent(new AirConditioner());

        CompositeComponent floor = new CompositeComponent();
        floor.addComponent(room1);
        floor.addComponent(room2);

        CompositeComponent house = new CompositeComponent();
        house.addComponent(floor);

        floor.turnon();
        floor.turnoff();
    }
}
