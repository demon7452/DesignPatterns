package com.patterns.observer.impl;

import com.alibaba.fastjson.JSON;
import com.patterns.observer.api.DisplayElement;
import com.patterns.observer.api.Observer;
import com.patterns.observer.api.Subject;
import com.patterns.observer.dto.WeatherData;

/**
 * Description:
 * Created by lixiong on 2017/12/25.
 */
public class CurrentConditionDisplay implements Observer<WeatherData>,DisplayElement {

    private WeatherData weatherData;

    private Subject weatherDataSubject;

    public CurrentConditionDisplay(Subject weatherDataSubject) {
        this.weatherDataSubject = weatherDataSubject;
    }

    public void display() {
        System.out.println("Current conditions:" + JSON.toJSONString(weatherData));
    }

    public void update(WeatherData weatherData) {
        this.weatherData = weatherData;
        display();
    }
}
