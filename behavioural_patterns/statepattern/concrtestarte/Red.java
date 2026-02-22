package statepattern.concrtestarte;

import statepattern.context.TrafficLightContext;
import statepattern.istate.TrafficState;

public class Red implements TrafficState {
    public void next(TrafficLightContext context) {
        System.out.println("Switching from red to green,cars go");
        context.setState(new Green());
    }

    public String getColor() {
        return "Red";
    }
}
