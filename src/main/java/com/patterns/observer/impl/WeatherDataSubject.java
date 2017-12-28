package com.patterns.observer.impl;

import com.google.common.collect.Lists;
import com.patterns.observer.api.Observer;
import com.patterns.observer.api.Subject;
import com.patterns.observer.dto.WeatherData;

import java.util.List;

/**
 * Description:
 * Created by lixiong on 2017/12/20.
 */
public class WeatherDataSubject implements Subject {

    private WeatherData weatherData;

    private List<Observer> observers;

    public WeatherDataSubject(){
        observers = Lists.newArrayList();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if(index != -1){
            observers.remove(observer);
        }
    }

    public void notifyObserver() {
        for(Observer observer : observers){
            observer.update(weatherData);
        }
    }

    public void measurementsChanged(){
        notifyObserver();
    }

    public void setMeasurements(WeatherData weatherData){
        this.weatherData = weatherData;
        measurementsChanged();
    }
}
