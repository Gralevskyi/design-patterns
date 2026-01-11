package com.hralievsky.learning.design.patterns.structural.adapter;

import com.hralievsky.learning.design.patterns.structural.adapter.adapters.AmericanAdapter;
import com.hralievsky.learning.design.patterns.structural.adapter.adapters.EuropeanAdapter;
import com.hralievsky.learning.design.patterns.structural.adapter.adapters.ScientificAdapter;
import com.hralievsky.learning.design.patterns.structural.adapter.thirdpartyservices.american.AmericanWeatherDashboard;
import com.hralievsky.learning.design.patterns.structural.adapter.thirdpartyservices.american.AmericanWeatherDashboardImpl;
import com.hralievsky.learning.design.patterns.structural.adapter.thirdpartyservices.european.EuropeanWeatherDashboard;
import com.hralievsky.learning.design.patterns.structural.adapter.thirdpartyservices.european.EuropeanWeatherDashboardImpl;
import com.hralievsky.learning.design.patterns.structural.adapter.thirdpartyservices.scientific.ScientificWeatherDashboard;
import com.hralievsky.learning.design.patterns.structural.adapter.thirdpartyservices.scientific.ScientificWeatherDashboardImpl;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class App {

    public static void main(String[] args) {
        AmericanWeatherDashboard americanWeatherDashboard = new AmericanWeatherDashboardImpl(32, "New York");
        AmericanAdapter americanAdapter = new AmericanAdapter(americanWeatherDashboard);

        EuropeanWeatherDashboard europeanWeatherDashboard = new EuropeanWeatherDashboardImpl(28, "Poland", LocalDate.now());
        EuropeanAdapter europeanAdapter = new EuropeanAdapter(europeanWeatherDashboard);

        int[] coordinates = {53, 76};
        ScientificWeatherDashboard scientificWeatherDashboard = new ScientificWeatherDashboardImpl(33.5f, coordinates, LocalDateTime.now());
        ScientificAdapter scientificAdapter = new ScientificAdapter(scientificWeatherDashboard);


        WeatherDashboardDisplay americanDisplay = new WeatherDashboardDisplay(americanAdapter);
        WeatherDashboardDisplay europeanDisplay = new WeatherDashboardDisplay(europeanAdapter);
        WeatherDashboardDisplay scientificDisplay = new WeatherDashboardDisplay(scientificAdapter);

        System.out.println("American");
        americanDisplay.display();

        System.out.println("European");
        europeanDisplay.display();

        System.out.println("Scientific");
        scientificDisplay.display();

    }
}
