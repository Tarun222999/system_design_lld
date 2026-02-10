package abstractfactorypattern.concretevehicles;

import abstractfactorypattern.Vehicle;

public class Toyota implements Vehicle {
    public void start() {
        System.out.println("Toyota Car is starting");
    }

    public void stop() {
        System.out.println("Toyota Car is stopping");
    }
}