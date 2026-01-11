package com.hralievsky.learning.design.patterns.structural.adapter;

import java.time.LocalDate;

public interface WeatherDashboard {
    double getTemperature();

    String getLocation();

    LocalDate getDate();
}
