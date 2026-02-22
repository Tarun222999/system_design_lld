package statepattern.context;

import statepattern.concrtestarte.Red;
import statepattern.istate.TrafficState;

public class TrafficLightContext {
    private TrafficState currentState;

    public TrafficLightContext() {
        this.currentState = new Red();

    }

    public void setState(TrafficState state) {
        this.currentState = state;
    }

    public void next() {
        currentState.next(this);
    }

    public String getColor() {
        return currentState.getColor();
    }
}
