package abstractfactorypattern.concretevehicles;

import abstractfactorypattern.Vehicle;

public class BMW implements Vehicle {
    public void start() {
        System.out.println("BMW Car is starting");
    }

    public void stop() {
        System.out.println("BMW Car is stopping");
    }
}