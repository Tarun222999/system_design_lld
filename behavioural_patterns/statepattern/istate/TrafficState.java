package statepattern.istate;

import statepattern.context.TrafficLightContext;

public interface TrafficState {
    void next(TrafficLightContext context);

    String getColor();
}