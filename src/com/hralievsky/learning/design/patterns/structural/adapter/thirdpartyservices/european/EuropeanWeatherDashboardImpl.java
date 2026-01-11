package com.hralievsky.learning.design.patterns.structural.adapter.thirdpartyservices.european;

import java.time.LocalDate;

public class EuropeanWeatherDashboardImpl implements EuropeanWeatherDashboard {
    private final float temerature;
    private final String country;
    private final LocalDate date;

    public EuropeanWeatherDashboardImpl(float temerature, String country, LocalDate date) {
        this.temerature = temerature;
        this.country = country;
        this.date = date;
    }

    @Override
    public float getTemperature() {
        return temerature;
    }

    @Override
    public String getCountry() {
        return country;
    }

    @Override
    public String getDate() {
        return date.toString();
    }
}
