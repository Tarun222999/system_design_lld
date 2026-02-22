package statepattern.concrtestarte;

import statepattern.context.TrafficLightContext;
import statepattern.istate.TrafficState;

public class Yellow implements TrafficState {
    public void next(TrafficLightContext context) {
        System.out.println("Switching from yellow to red ,stop");
        context.setState(new Red());
    }

    public String getColor() {
        return "Red";
    }
}