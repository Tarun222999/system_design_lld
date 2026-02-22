package statepattern.concrtestarte;

import statepattern.context.TrafficLightContext;
import statepattern.istate.TrafficState;

public class Green implements TrafficState {
    public void next(TrafficLightContext context) {
        System.out.println("Switching from green to yellow ,slow down");
        context.setState(new Yellow());
    }

    public String getColor() {
        return "Red";
    }
}