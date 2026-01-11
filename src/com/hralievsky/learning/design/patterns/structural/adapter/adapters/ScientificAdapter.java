package com.hralievsky.learning.design.patterns.structural.adapter.adapters;

import com.hralievsky.learning.design.patterns.structural.adapter.WeatherDashboard;
import com.hralievsky.learning.design.patterns.structural.adapter.thirdpartyservices.scientific.ScientificWeatherDashboard;

import java.time.LocalDate;
import java.util.Arrays;

public class ScientificAdapter implements WeatherDashboard {
    private final ScientificWeatherDashboard weatherDashboard;

    public ScientificAdapter(ScientificWeatherDashboard weatherDashboard) {
        this.weatherDashboard = weatherDashboard;
    }

    @Override
    public double getTemperature() {
        return kelvinToCelsius(weatherDashboard.getTemperature());
    }

    private double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    @Override
    public String getLocation() {
        return Arrays.toString(weatherDashboard.getCoordinates());
    }

    @Override
    public LocalDate getDate() {
        return weatherDashboard.getDateTime().toLocalDate();
    }
}
