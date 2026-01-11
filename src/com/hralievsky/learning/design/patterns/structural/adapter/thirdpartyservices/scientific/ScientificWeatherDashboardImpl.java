package com.hralievsky.learning.design.patterns.structural.adapter.thirdpartyservices.scientific;

import java.time.LocalDateTime;

public class ScientificWeatherDashboardImpl implements ScientificWeatherDashboard {
    private final float temperature;
    private final int[] coordinates;
    private final LocalDateTime dateTime;

    public ScientificWeatherDashboardImpl(float temperature, int[] coordinates, LocalDateTime dateTime) {
        this.temperature = temperature;
        this.coordinates = coordinates;
        this.dateTime = dateTime;
    }


    @Override
    public float getTemperature() {
        return temperature;
    }

    @Override
    public int[] getCoordinates() {
        return coordinates;
    }

    @Override
    public LocalDateTime getDateTime() {
        return dateTime;
    }
}
