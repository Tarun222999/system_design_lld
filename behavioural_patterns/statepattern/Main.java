package statepattern;

import statepattern.context.TrafficLightContext;

public class Main {
    public static void main(String[] args) {
        TrafficLightContext trafficLight = new TrafficLightContext();

        trafficLight.next();
        trafficLight.next();
        trafficLight.next();
        trafficLight.next();
    }
}
