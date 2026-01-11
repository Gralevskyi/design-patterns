package com.hralievsky.learning.design.patterns.structural.adapter.thirdpartyservices.american;

public class AmericanWeatherDashboardImpl implements AmericanWeatherDashboard {
    private final int fahrenheitTemperature;
    private final String location;

    public AmericanWeatherDashboardImpl(int fahrenheitTemperature, String location) {
        this.fahrenheitTemperature = fahrenheitTemperature;
        this.location = location;
    }

    @Override
    public int getFahrenheitTemperature() {
        return fahrenheitTemperature;
    }

    @Override
    public String getLocation() {
        return location;
    }
}
