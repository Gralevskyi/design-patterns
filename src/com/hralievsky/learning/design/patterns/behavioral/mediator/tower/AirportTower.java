package com.hralievsky.learning.design.patterns.behavioral.mediator.tower;

import com.hralievsky.learning.design.patterns.behavioral.mediator.aircraft.Aircraft;

import java.util.HashMap;
import java.util.Map;

public class AirportTower implements Tower {
    private final Map<String, Aircraft> aircrafts = new HashMap<>();


    @Override
    public void registerAircraft(Aircraft aircraft) {
        aircraft.setTower(this);
        aircrafts.put(aircraft.getCallsign(), aircraft);

    }

    @Override
    public void getMessageFromAircraft(Aircraft aircraft, String message) {
        System.out.println("Tower received notification from " + aircraft.getCallsign() + ": " + message);

        for (Aircraft registeredAircraft : aircrafts.values()) {
            if (!registeredAircraft.getCallsign().equals(aircraft.getCallsign())) {
                sendMessageTo(registeredAircraft, "Broadcast from " + aircraft.getCallsign() + ": " + message);
            }
        }

        sendMessageTo(aircraft, "message received by Tower");
    }

    @Override
    public void sendMessageTo(Aircraft aircraft, String message) {
        aircraft.receiveNotification(message);
    }
}
