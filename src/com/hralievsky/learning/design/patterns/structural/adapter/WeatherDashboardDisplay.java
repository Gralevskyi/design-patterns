package com.hralievsky.learning.design.patterns.structural.adapter;

public class WeatherDashboardDisplay {
    WeatherDashboard weatherDashboard;

    public WeatherDashboardDisplay(WeatherDashboard weatherDashboard) {
        this.weatherDashboard = weatherDashboard;
    }

    public void display() {
        System.out.println("Temperature: " + weatherDashboard.getTemperature());
        System.out.println("Location: " + weatherDashboard.getLocation());
        System.out.println("Date " + weatherDashboard.getDate().toString());
    }
}
