package com.hralievsky.learning.design.patterns.behavioral.mediator.aircraft;

import com.hralievsky.learning.design.patterns.behavioral.mediator.tower.Tower;

public interface Aircraft {
    String getCallsign();

    void sendMessage(String message);

    void receiveNotification(String message);

    void setTower(Tower tower);
}
