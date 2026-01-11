package com.hralievsky.learning.design.patterns.structural.adapter.adapters;

import com.hralievsky.learning.design.patterns.structural.adapter.WeatherDashboard;
import com.hralievsky.learning.design.patterns.structural.adapter.thirdpartyservices.american.AmericanWeatherDashboard;

import java.time.LocalDate;

public class AmericanAdapter implements WeatherDashboard {
    private final AmericanWeatherDashboard weatherDashboard;
    private final LocalDate date;

    public AmericanAdapter(AmericanWeatherDashboard dashboard) {
        this.weatherDashboard = dashboard;
        this.date = LocalDate.now();
    }

    @Override
    public double getTemperature() {
        return fahrenheitToCelsius(weatherDashboard.getFahrenheitTemperature());
    }

    @Override
    public String getLocation() {
        return weatherDashboard.getLocation();
    }

    @Override
    public LocalDate getDate() {
        return date;
    }

    double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
