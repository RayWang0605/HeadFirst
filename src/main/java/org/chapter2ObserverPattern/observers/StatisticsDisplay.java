package org.chapter2ObserverPattern.observers;

import org.chapter2ObserverPattern.model.DisplayElement;
import org.chapter2ObserverPattern.model.Observer;
import org.chapter2ObserverPattern.model.Subject;
import org.chapter2ObserverPattern.utils.ArrayOperation;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;

public class StatisticsDisplay implements Observer, DisplayElement {
    private int recordAmount = 5;
    private ArrayList historyTemperature;
    private ArrayList historyHumidity;
    private ArrayList historyPressure;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.historyTemperature = new ArrayList();
        this.historyHumidity = new ArrayList();
        this.historyPressure = new ArrayList();
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("=====Statistics Condition=====");

        float maxTemp = ArrayOperation.max(historyTemperature);
        float avgTemp = ArrayOperation.average(historyTemperature);
        float minTemp = ArrayOperation.min(historyTemperature);
        System.out.println(String.format("Temperature Min/Avg/Max: %,1f/%.1f/%.1f", minTemp, avgTemp, maxTemp));

        float maxHum = ArrayOperation.max(historyHumidity);
        float avgHum = ArrayOperation.average(historyHumidity);
        float minHum = ArrayOperation.min(historyHumidity);
        System.out.println(String.format("Humidity Min/Avg/Max: %.2f/%.2f/%.2f", minHum, avgHum, maxHum));

        float maxPres = ArrayOperation.max(historyPressure);
        float avgPres = ArrayOperation.average(historyPressure);
        float minPres = ArrayOperation.min(historyPressure);
        System.out.println(String.format("Pressure Min/Avg/Max: %.1f/%.1f/%.1f", minPres, avgPres, maxPres));
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        historyTemperature.add(temperature);
        historyHumidity.add(humidity);
        historyPressure.add(pressure);
        if (historyTemperature.size() > recordAmount) {
            historyTemperature.remove(0);
            historyHumidity.remove(0);
            historyPressure.remove(0);
        }
        display();
    }
}
