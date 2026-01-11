package com.hralievsky.learning.design.patterns.structural.adapter.thirdpartyservices.scientific;

import java.time.LocalDateTime;

public interface ScientificWeatherDashboard {
    float getTemperature();

    int[] getCoordinates();

    LocalDateTime getDateTime();
}
