package com.hralievsky.learning.design.patterns.behavioral.mediator.tower;

import com.hralievsky.learning.design.patterns.behavioral.mediator.aircraft.Aircraft;

public interface Tower {
    void registerAircraft(Aircraft aircraft);

    void getMessageFromAircraft(Aircraft aircraft, String message);

    void sendMessageTo(Aircraft aircraft, String message);
}
