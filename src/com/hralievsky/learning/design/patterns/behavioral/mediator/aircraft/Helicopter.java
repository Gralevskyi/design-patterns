package com.hralievsky.learning.design.patterns.behavioral.mediator.aircraft;


import com.hralievsky.learning.design.patterns.behavioral.mediator.tower.Tower;

public class Helicopter implements Aircraft {
    private final String callsign;
    private Tower tower;

    public Helicopter(String callsign) {
        this.callsign = callsign;
    }

    @Override
    public String getCallsign() {
        return callsign;
    }

    @Override
    public void sendMessage(String message) {
        if (tower != null) {
            System.out.println(callsign + " sending " + message + " to Tower");
            tower.getMessageFromAircraft(this, message);
        }
    }

    @Override
    public void receiveNotification(String message) {
        System.out.println(callsign + " received notification " + message);
    }

    @Override
    public void setTower(Tower tower) {
        this.tower = tower;
    }

}
