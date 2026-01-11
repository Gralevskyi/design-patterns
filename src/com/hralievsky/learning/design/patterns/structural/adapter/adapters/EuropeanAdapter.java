package com.hralievsky.learning.design.patterns.structural.adapter.adapters;

import com.hralievsky.learning.design.patterns.structural.adapter.WeatherDashboard;
import com.hralievsky.learning.design.patterns.structural.adapter.thirdpartyservices.european.EuropeanWeatherDashboard;

import java.time.LocalDate;

public class EuropeanAdapter implements WeatherDashboard {
    private final EuropeanWeatherDashboard weatherDashboard;

    public EuropeanAdapter(EuropeanWeatherDashboard weatherDashboard) {
        this.weatherDashboard = weatherDashboard;
    }

    @Override
    public double getTemperature() {
        return weatherDashboard.getTemperature();
    }

    @Override
    public String getLocation() {
        return weatherDashboard.getCountry();
    }

    @Override
    public LocalDate getDate() {
        return LocalDate.parse(weatherDashboard.getDate());
    }
}
