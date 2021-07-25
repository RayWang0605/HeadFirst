package org.chapter2ObserverPattern;

import org.chapter2ObserverPattern.observers.CurrentConditionDisplay;
import org.chapter2ObserverPattern.observers.StatisticsDisplay;
import org.chapter2ObserverPattern.subjects.WeatherData;

import java.util.ArrayList;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(37.0f, 0.6f, 1000.0f);
        weatherData.setMeasurements(36.5f, 0.65f, 1003.0f);
    }
}
